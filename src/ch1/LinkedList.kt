package ch1

import util.nonNull

class LinkedList<T> {
    private var _head: Node<T>? = null
    var size: Int = 0
        private set

    fun add(param: T) {
        val newNode = Node.createNode(param)

        if (_head == null && size == 0) {
            _head = newNode
            size ++
            return
        }

        var currentNode = _head
        while (currentNode?.hasNextNode().nonNull()) {
            currentNode = currentNode?.next
        }

        currentNode?.linkNextNode(newNode)
        size++
    }

    fun add(index: Int, param: T) {
        if (index < 0 || index > size)
            throw IndexOutOfBoundsException("LinkedList 인덱스($index)가 사이즈(${size})를 넘었습니다.")

        val newNode = Node.createNode(param)

        if (index == 0) {
            newNode.linkNextNode(_head)
            _head = newNode
            size++
            return
        }

        var currentNode: Node<T>? = _head

        (0 .. size).forEach { currentIndex ->
            if (currentIndex == index -1) {
                newNode.linkNextNode(currentNode?.next)
                currentNode?.linkNextNode(newNode)
                size++
                return@forEach
            }
            if (currentNode?.hasNextNode().nonNull()) {
                currentNode = currentNode?.next
            }
        }

    }

    fun removeAt(index: Int): Node<T>? {
        if (index < 0 || index > size)
            throw IndexOutOfBoundsException("LinkedList remove 인덱스($index)가 사이즈(${size})를 넘었습니다.")

        if (index == 0) {
            val targetRemoveNode = _head
            _head = _head?.next
            size--
            return targetRemoveNode
        }

        var currentNode = _head

        (0..size).forEach { currentIndex ->

            if (currentIndex == index -1) {
                val targetRemoveNode = currentNode?.next
                currentNode?.linkNextNode(targetRemoveNode?.next)
                size--
                return targetRemoveNode
            }

            if (currentNode?.hasNextNode().nonNull()) {
                currentNode = currentNode?.next
            }
        }
        return null
    }

    fun removeLast(): Node<T>? {
        return removeAt(size -1)
    }

    fun get(index: Int): Node<T>? {
        if (index == 0) {
            return _head
        }

        var currentNode = _head
        (0 until size).forEach { currentIndex ->
            if (currentIndex == index) {
                return currentNode
            }
            if (currentNode?.hasNextNode().nonNull()) {
                currentNode = currentNode?.next
            }
        }
        return null
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

}