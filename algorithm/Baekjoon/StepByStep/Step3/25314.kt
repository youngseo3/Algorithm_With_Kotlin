package kr.ac.tukorea.algorithm.Baekjoon.StepByStep.Step3


fun main() = with(System.`in`.bufferedReader()) {
    val byte = readLine().toInt()
    for(i in 1..byte step 4) {
        print("long ")
    }
    println("int")
}