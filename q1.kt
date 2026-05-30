//Write a class BankAccount with a private var balance: Double. Provide a public function deposit(amount: Double) that safely adds to the balance. 
class BankAccount {
    private var balance: Double = 0.0
    fun deposit(amount: Double) { if (amount > 0) balance += amount }
    fun getBalance(): Double = balance
}

fun main() {
    val acc = BankAccount()
    acc.deposit(500.0)
    acc.deposit(200.0)
    println(acc.getBalance()) 
}
