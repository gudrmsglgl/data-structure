package ch2.recursion

fun main() {
    println("tailrec 6! > ${factorialAdvanced(6)}")
    println("6! > ${factorial(6)}")
}

private tailrec fun factorialAdvanced(n: Int, result: Int = 1): Int {
    if (n == 1) return result

    return factorialAdvanced(n-1, n * result)
}


// 5! >n: 5 >  n * 4 * 3 * 2 * 1 >> n * 4!
// 4! >n: 4 >  n * 3 * 2 * 1 >> n * 3!
// 3! >n: 3 >  n * 2 * 1 >>
private fun factorial(n: Int): Int {
    if (n == 1) {
        return 1
    }
    return n * factorial(n-1)
}