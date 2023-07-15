package kr.ac.tukorea.algorithm.Baekjoon.StepByStep.Step3

import java.util.*

fun main() = with(System.`in`.bufferedReader()) { // bufferedReader
    val count = readLine().toInt()
    for(i in 1..count){
        val st = StringTokenizer(readLine())
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()
        println(a+b)
    }

}

//fun main() = with(Scanner(System.`in`)) {
//    for(i in 1..nextInt()){
//        println(nextInt()+nextInt())
//    }
//}