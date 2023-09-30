package ch1

class Node<T> private constructor(private val data: T) {
    var next: Node<T>? = null
        private set

    fun linkNextNode(param: Node<T>?) {
        next = param
    }

    fun hasNextNode(): Boolean = next != null

    companion object {
        fun <T>createNode(param: T): Node<T> {
            return Node(param)
        }
    }

    override fun toString(): String {
        return "Node [data: $data, next: $next]"
    }
}