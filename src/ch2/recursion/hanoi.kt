package ch2.recursion

// 1 ------ _ ------ _
// 2 ------ _ ------ _
// 3 ------ _ ------ _
// A ------ B ------ C
fun main() {
    val moveCount = hanoi(4, from = "A", to = "C", temp = "B")
    println("moveCount: $moveCount")
}

// _ ------ _ ------ _
// _ ------ 1 ------ _
// _ ------ 2 ------ 3
// A ------ B ------ C

// stack[0] = 3이 C로 간다 (상위)
// stack[1] = [1,2]이 B로 간다 (하위문제)
// stack[2] = 1이 c로 간다
// 실행
// stack[2] = 1이 c로 간다
// stack[1] = [1,2]이 B로 간다
// stack[0] = 3이 c로 간다

// B 에서 C로 옮겨야 함
// [1,2] => [1] [2] => stack[0] : 2를 C로 이동
// [1,2] => [1] [2] => stack[1] : 1(하위를) A로 이동

fun hanoi(count: Int, from: String, to: String, temp: String): Int {
    var moveCount = 0

    if (count == 0) return moveCount
    moveCount += hanoi(count = count -1, from = from, to = temp, temp = to)
    moveNumber(count = count, from = from, to = to)
    moveCount += 1
    moveCount += hanoi(count = count -1, from = temp, to = to, temp = from)
    return moveCount
}

private fun moveNumber(count: Int, from: String, to: String) {
    println("$from 에서의 $count =====> $to 로 이동")
}
