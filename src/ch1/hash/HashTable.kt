package ch1.hash

import ch1.LinkedList

class HashTable<T>(private val size: Int) {
    private val array: Array<LinkedList<HashData<T>>?> = arrayOfNulls(size)

    fun put(key: String, value: T) {
        val index = getIndex(key)
        val list : LinkedList<HashData<T>> = array[index] ?: generateEmptyList(index)

        for (i in 0 until list.size) {
            val hashData = list.get(i)
            if (hashData != null) {
                val hashKey = hashData.data.key
                if (key == hashKey) {
                    list.removeAt(i)
                    list.add(i, HashData(key = key, data = value))
                    return
                }
            }
        }

        list.add(HashData(key = key, data = value))
    }

    fun get(key: String): T? {
        val index = getIndex(key)
        val list = array[index] ?: return null

        for (i in 0 until list.size) {
            val node = list.get(i) ?: continue
            if (key == node.data.key)
                return node.data.data
        }
        return null
    }

    fun printAll() {
        array.forEachIndexed { index, linkedList ->
            println("index:$index")
            println(linkedList?.printAll())
        }
    }


    private fun getIndex(key: String): Int {
        return key.hashCode() % size
    }

    private fun generateEmptyList(index: Int): LinkedList<HashData<T>> {
        val emptyList = LinkedList<HashData<T>>()
        array[index] = emptyList
        return emptyList
    }
}