package ch2.recursion

fun main() {
    println("6! > ${factorial(6)}")
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