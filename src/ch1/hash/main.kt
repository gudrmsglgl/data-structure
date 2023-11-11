package ch1.hash

fun main() {
    val hashSet = HashSet<String>(4)
    hashSet.add("4")
    hashSet.add("5")
    hashSet.add("4")
    hashSet.remove("4")
    hashSet.printAll()

}

private fun executeHashTable() {
    val hashTable = HashTable<String>(5)
    hashTable.put("key1","value1")
    hashTable.put("key2","value2")
    hashTable.put("key2","ㄱㅏ나다")
    hashTable.put("key3","abc")

    hashTable.printAll()

    println("get(key2) > ${hashTable.get("key2")}")
}