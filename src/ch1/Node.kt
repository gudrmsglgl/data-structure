package ch1

class Node<T> private constructor(val data: T) {
    var next: Node<T>? = null
        private set

    fun linkNextNode(param: Node<T>) {
        next = param
    }

    companion object {
        fun <T>createNode(param: T): Node<T> {
            return Node(param)
        }
    }

    override fun toString(): String {
        return "ch1.Node [data: $data, next: $next]"
    }
}