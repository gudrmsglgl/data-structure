package ch1

import util.nonNull

class LinkedList<T> {
    private var _head: Node<T>? = null
    private var size: Int = 0

    fun add(param:T) {
        if (_head == null) {
            createHeadNode(param)
            size++
            return
        }

        var currentHead: Node<T>? = null

        (0 until size).forEach { index ->
            if (index == 0) {
                currentHead = _head
            }

            if (index == size.minus(1)) {
                val newNode = Node.createNode(param)
                currentHead?.linkNextNode(newNode)
                size++
                return@forEach
            }

            if (currentHead?.hasNextNode().nonNull()) {
                currentHead = currentHead?.next
            }
        }

    }

    fun add(index: Int, param: T) {
        if (index < 0 || index > size) throw IndexOutOfBoundsException("LinkedList 인덱스($index)가 사이즈(${size})를 넘었습니다.")
        if (index == 0 && _head == null) {
            createHeadNode(param)
            size++
            return
        }
        if (index == 0 && _head != null) {
            val currentHeadNode = _head
            val newNode = Node.createNode(param)
            newNode.linkNextNode(currentHeadNode!!)
            size++
            return
        }
        if (index == size) {
            var currentHead: Node<T>? = _head
            (0 until size).forEach { idx ->
                if (currentHead?.hasNextNode().nonNull()) {
                    currentHead = currentHead?.next
                }
                if (idx == size.minus(1)) {
                    val newNode = Node.createNode(param)
                    currentHead?.linkNextNode(newNode)
                    size++
                    return
                }
            }
        }
        var currentHead = _head
        var originIndexHead: Node<T>? = null
        (0 until size).forEach { idx ->
            if (index.minus(1) != idx && currentHead?.hasNextNode().nonNull()) {
                currentHead = currentHead?.next
                originIndexHead = currentHead?.next
                return@forEach
            }
            val newNode = Node.createNode(param)
            newNode.linkNextNode(originIndexHead!!)
            currentHead?.linkNextNode(newNode)
            size++
            return
        }

    }

    // 0. 범위를 벗어난 index 에 대한 throw 처리
    // 1. 첫 번째 아이템을 지울 경우 > ?
    // 2. 맨 마지막 아이템을 지울 경우 > 마지막 인덱스 전.next = null
    // 3. size 만큼 아이템을 이동하면서 해당 인덱스에 해당하는 아이템을 찾는다.
    // 4. 지우는아이템.next 를 지우는아이템-1.next 에 연결시켜준다.
    fun removeAt(index: Int) {

    }


    fun clear() {
        println("링크드리스트 데이터 클리어!!!")
        _head = null
        size = 0
        println()
    }

    fun printAll() {
        println("=================ch1.LinkedList PrintAll=================")
        var currentHead = _head
        (0 until size).forEach { index ->
            println(currentHead)
            val nextNode = currentHead?.next
            currentHead = nextNode
        }
        println("=====================================================")
        println()
    }

    private fun createHeadNode(param: T) {
        _head = Node.createNode(param)
    }

}