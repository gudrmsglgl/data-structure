package ch1.hash

class HashSet<T>(private val size: Int) {
    private val hashTable: HashTable<T> = HashTable(size)

    fun add(param: T) {
        if (isContain(param)) return
        hashTable.put("param $param", param)
    }

    fun isContain(param: T): Boolean {
        return hashTable.get(getKey(param)) != null
    }

    fun remove(param: T) {
        hashTable.remove(getKey(param))
    }

    fun printAll() {
        hashTable.printAll()
    }


    private fun getKey(param: T) = "param $param"
}