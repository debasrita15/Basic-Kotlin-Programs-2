//Expand on your ScreenState sealed class from Question 10 by adding an Error(val 
//errorMsg: String) state. Then, write a function fun renderUI(state: ScreenState) that uses 
//an exhaustive when expression to print a specific message for all three possible states.
sealed class ScreenState {
    object Loading : ScreenState()
    data class Success(val data: String) : ScreenState()
    data class Error(val errorMsg: String) : ScreenState()
}

fun renderUI(state: ScreenState) {
    when (state) {
        is ScreenState.Loading -> println("Loading, please wait...")
        is ScreenState.Success -> println("Data loaded: ${state.data}")
        is ScreenState.Error   -> println("Error: ${state.errorMsg}")
    }
}

fun main() {
    renderUI(ScreenState.Loading)
    renderUI(ScreenState.Success("Dashboard"))
    renderUI(ScreenState.Error("Network timeout"))
}
