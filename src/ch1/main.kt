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
        add(0, "value1")
        add( "value2")
        add( "value3")
        add("value4")
        add(2,"value5")

        printAll()
    }

}