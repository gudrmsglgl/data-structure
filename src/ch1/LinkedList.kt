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
            changeHeadNode(newNode)
            return
        }


        var pointerHead: Node<T>? = null
        var beforeHead: Node<T>? = null


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

    private fun changeHeadNode(param: Node<T>) {
        _head = param
    }

}