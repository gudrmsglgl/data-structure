package ch2.recursion

fun main() {
    val exArray = arrayOf(0,1,2,3,4,5)
    println("[0,1,2,3,4,5] sum >> ${sumArray(exArray)}")
    println("[0,1,2,3,4,5] sumArrayAdvanced >> ${sumArrayAdvanced(exArray)}")
}

// [1, 2, 3, 4, 5] > [1,2,3,4] + 5
// [1,2,3,4] > [1,2,3] + 4
// [1,2,3] > [1,2] + 3
private fun sumArray(input: Array<Int>): Int {
    if (input.size == 1) {
        return input[0]
    }
    //val excludeLastIndexArray = input.sliceArray(IntRange(0, input.lastIndex -1))
    val excludeLastIndexArray = input.sliceArray(0 .. input.lastIndex.minus(1))
    return sumArray(excludeLastIndexArray) + input[input.lastIndex]
}

private tailrec fun sumArrayAdvanced(input: Array<Int>, result: Int = 0): Int {
    if (input.size == 1) return result
    val excludeLastIndexArray = input.sliceArray(0 .. input.lastIndex.minus(1))
    return sumArrayAdvanced(excludeLastIndexArray, result + input[input.lastIndex])
}