//The E-Commerce Checkout Pipeline 
import kotlinx.coroutines.*

data class CartItem(val name: String, val price: Double, val quantity: Int)

fun List<CartItem>.calculateTotal(): Double = sumOf { it.price * it.quantity }

sealed class CheckoutResult {
    object Processing : CheckoutResult()
    data class Success(val receiptId: String) : CheckoutResult()
    data class Failed(val reason: String) : CheckoutResult()
}

object PaymentProcessor {
    suspend fun processPayment(cart: List<CartItem>): CheckoutResult {
        delay(2000)
        val total = cart.calculateTotal()
        return if (total > 1000.0)
            CheckoutResult.Failed("Insufficient funds for large transaction")
        else
            CheckoutResult.Success("TXN-${(1000..9999).random()}")
    }
}

fun main() = runBlocking {
    val cheapCart = listOf(
        CartItem("Mouse", 25.0, 1),
        CartItem("USB Hub", 20.0, 2)
    )
    val expensiveCart = listOf(
        CartItem("Laptop", 1200.0, 1),
        CartItem("Headphones", 150.0, 1)
    )

    val job1 = launch {
        val result = PaymentProcessor.processPayment(cheapCart)
        print("Cheap cart → ")
        when (result) {
            is CheckoutResult.Processing -> println("Still processing...")
            is CheckoutResult.Success    -> println("Payment succeeded! Receipt: ${result.receiptId}")
            is CheckoutResult.Failed     -> println("Payment failed: ${result.reason}")
        }
    }

    val job2 = launch {
        val result = PaymentProcessor.processPayment(expensiveCart)
        print("Expensive cart → ")
        when (result) {
            is CheckoutResult.Processing -> println("Still processing...")
            is CheckoutResult.Success    -> println("Payment succeeded! Receipt: ${result.receiptId}")
            is CheckoutResult.Failed     -> println("Payment failed: ${result.reason}")
        }
    }

    job1.join()
    job2.join()
}
