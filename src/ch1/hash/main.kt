package ch1.hash

fun main() {
    val hashTable = HashTable<String>(5)
    hashTable.put("key1","value1")
    hashTable.put("key2","value2")
    hashTable.put("key2","ㄱㅏ나다")
    hashTable.put("key3","abc")

    hashTable.printAll()

    println("get(key2) > ${hashTable.get("key2")}")
}