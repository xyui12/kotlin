// The repeat function is a higher-order function 
//that executes a given function a specified number of times




fun main() {
    val numberOfRows = 5

    repeat(numberOfRows) { row ->
        val spaces = numberOfRows - row - 1
        val asterisks = 2 * row + 1

        // Print leading spaces
        repeat(spaces) {
            print(" ")
        }

        // Print asterisks
        repeat(asterisks) {
            print("*")
        }

        // Print trailing newline
        println()
    }
}
