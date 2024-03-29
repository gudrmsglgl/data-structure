import ch1.DoublyLinkedList
import ch1.LinkedList
import ch1.Queue
import ch1.Stack

fun main() {
    queueEx()
}

private fun queueEx() {
    val queue = Queue<String>()
    with(queue) {
        enqueue("item 1")
        enqueue("item 2")
        enqueue("item 3")
        println("front: ${front()}")
        println("dequeue: ${dequeue()}")
        println("dequeue: ${dequeue()}")
        println("dequeue: ${dequeue()}")
        println("dequeue: ${dequeue()}")
        println("isEmpty: ${isEmpty()}")
    }
}

private fun doubleListEx() {
    val doubleLinkedList = DoublyLinkedList<String>()
    with(doubleLinkedList) {
        add("item0")
        add("item1")
        add("item2")

        add(0, "item3")
        add(1, "item4")
        add(5,  "item5")

        removeLast()
        removeAt(1)
        printAll()
    }
}

private fun singleListEx() {
    val linkedList = LinkedList<String>()
    with(linkedList) {
        println("새로운 데이터 추가 시작")
        add("item0")
        add(1,"item1")
        add(2,"item2")
        add("item3")
        println("index:2 제거 > ${removeAt(2)}") // item0, item1, item3
        println("last Index 제거 > ${removeLast()}") // item0, item1
        printAll()

        println("get(1) > ${get(1)}") // item1
        println("get(2) > ${get(2)}") // item1
        clear()
        printAll()
    }

    val stack = Stack<String>()
    stack.push("1")
    stack.push("2")
    stack.push("3")
    stack.push("4")

    println("pop(): ${stack.pop()}")
    println("pop(): ${stack.pop()}")
    println("pop(): ${stack.pop()}")
    println("peek(): ${stack.peek()}")
}