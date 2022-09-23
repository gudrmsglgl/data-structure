package util

fun Boolean?.nonNull(): Boolean {
    return this ?: false
}