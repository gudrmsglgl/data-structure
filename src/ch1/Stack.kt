package ch1

import java.lang.Exception

class Stack<T> {
    private val linkedList = LinkedList<T>()
    private var size = 0

    fun push(param: T) {
        linkedList.add(0, param)
    }

    fun pop(): Node<T>? {
        return linkedList.removeAt(0)
    }

    fun peek(): Node<T>? {
        return linkedList.get(0)
    }

    fun isEmpty(): Boolean {
        return linkedList.size == 0
    }

}