package ch2.sort

import kotlin.math.min

fun main() {
    val array = arrayOf(9,2,10,3)
    //bubbleSort(array)
    selectionSort(array)
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

private fun selectionSort(array: Array<Int>) {
    for (i in array.indices) {
        var minValueIndex = i // init

        for (j in (i+1) until array.size) {
            if (array[j] < array[minValueIndex]) {
                minValueIndex = j
            }
        }

        val temp = array[i]
        array[i] = array[minValueIndex]
        array[minValueIndex] = temp
    }

    array.forEachIndexed { index, i ->
        println("selection sort > index[$index] > $i")
    }
}