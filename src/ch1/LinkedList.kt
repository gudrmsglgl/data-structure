package ch1

class LinkedList<T> {
    private var _head: Node<T>? = null
    private var size: Int = 0

    fun add(param:T) {
        if (_head == null) {
            createHeadNode(param)
            size++
            return
        }

        var pointerHead: Node<T>? = null
        var beforeHead: Node<T>? = null

        moveHeadNode(
            firstIndex = {
                pointerHead = _head
            },
            lastIndex = {
                val newNode = Node.createNode(param)
                pointerHead = newNode
                beforeHead?.linkNextNode(pointerHead!!)
                size++
                return@moveHeadNode
            },
            setHead = {
                beforeHead = pointerHead
                pointerHead = pointerHead?.next
            }
        )

        /*(0..size).forEach { index ->
            if (index == 0) {
                pointerHead = _head
            }

            if (index == size) {
                val nextNode = ch1.Node.createNode(param)
                println("nextNode: $nextNode")
                pointerHead = nextNode
                beforeHead?.linkNextNode(pointerHead!!)
                size++
                return
            }
            beforeHead = pointerHead
            pointerHead = pointerHead?.next
        }*/

    }

    fun printAll() {
        println("=================ch1.LinkedList PrintAll=================")
        var currentHead = _head
        (0..size).forEach { index ->
            if (index == size) return@forEach
            println(currentHead)
            val nextNode = currentHead?.next
            currentHead = nextNode
        }
        println("=====================================================")
        println()
    }

    private fun moveHeadNode(firstIndex: () -> Unit, lastIndex: () -> Unit, setHead: () -> Unit) {
        (0..size).forEach { index ->
            if (index == 0) {
                firstIndex.invoke()
            }

            if (index == size) {
                lastIndex.invoke()
            }

            setHead.invoke()
        }
    }

    private fun createHeadNode(param: T) {
        _head = Node.createNode(param)
    }

}