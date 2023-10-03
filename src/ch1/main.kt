import ch1.LinkedList

fun main() {
    val linkedList = LinkedList<String>()
    with(linkedList) {
        println("새로운 데이터 추가 시작")
        add("item0")
        add(1,"item1")
        add(2,"item2")
        add("item3")
        removeAt(2) // item0, item1, item3
        removeLast() // item0, item1
        printAll()
        clear()
        printAll()
    }

}