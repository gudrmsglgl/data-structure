package ch1

class Queue<T> {
    private val list = DoublyLinkedList<T>()

    fun enqueue(param: T) {
        list.add(0, param)
    }

    fun dequeue(): T? {
        return try {
            list.removeLast()?.data
        } catch (e: IndexOutOfBoundsException) {
            null
        }
    }

    fun front(): T? {
        return list.tail?.data
    }

    fun isEmpty(): Boolean = list.size == 0
}