import ch1.LinkedList

fun main() {
    val linkedList = LinkedList<String>()
    with(linkedList) {
        println("새로운 데이터 추가 시작")
        add(0, "value0")
        add( 1,"value1")
        add("value2")
        add(1, "value3")
        add(2, "value4")

        printAll()
    }

}