package com.example.wortswitcher

fun reverseString(input: String): String {
    var reversed = ""
    for (i in input.length - 1 downTo 0) {
        reversed += input[i]
    }
    return reversed
}

fun main() {
    val input1 = "codingschool"
    val input2 = "mustermann"

    println("Input: '$input1' - Output: '${reverseString(input1)}'")
    println("Input: '$input2' - Output: '${reverseString(input2)}'")
}
