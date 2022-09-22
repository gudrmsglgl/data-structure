import ch1.LinkedList

fun main() {
    val linkedList = LinkedList<String>()
    with(linkedList) {
        add("1")
        add("2")
        add("3")
        add("4")
        add("5")

        printAll()

        clear()
        printAll()

        println("새로운 데이터 추가 시작")
        add("value1")
        add("value2")

        printAll()
    }

}