package ch2.sort

fun main() {
    val array = arrayOf(4,2,3,1)
    bubbleSort(array)
}

private fun bubbleSort(array: Array<Int>) {
    // 4 2 3 1 > size 4
    // 2 4 3 1
    // 2 3 4 1
    // 2 3 1 4
    //         > size 3

    // for (0 .. 3)
    // for (0 .. 2)
    // for (0 .. 1)
    // for (0 .. 0)
    // ==> for (3 .. 0) for (0 .. size)

    for (j in array.lastIndex downTo 0) {
        array
            .forEachIndexed { index, currentValue ->
                if (index < j && currentValue > array[index+1]) {
                    val temp = array[index + 1]
                    array[index + 1] = currentValue
                    array[index] = temp
                }
            }
    }

    array.forEachIndexed { index, value ->
        println("index[$index] > $value")
    }
}