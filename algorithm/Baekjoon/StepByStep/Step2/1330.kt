package kr.ac.tukorea.algorithm.Baekjoon.StepByStep.Step2

import java.util.StringTokenizer

//fun main() = with(System.`in`.bufferedReader()) {
//    val arr = ArrayList<Int>()
//    val st = StringTokenizer(readLine())
//
//    while (st.hasMoreTokens()) { // st.hasMoreTokens() -> StringTokenizer에 사용할 수 있는 토큰이 더 있는지 확인
//        arr.add(st.nextToken().toInt()) // st.nextToken() -> StringTokenizer에서 다음 토큰을 불러오는 메서드
//    }
//
//    if(arr[0] > arr[1]){
//        println(">")
//    } else if (arr[0] == arr[1]){
//        println("==")
//    } else {
//        println("<")
//    }
//}

fun main() = with(System.`in`.bufferedReader()) {
    val st = StringTokenizer(readLine())
    val a = st.nextToken().toInt()
    val b = st.nextToken().toInt()

    if(a > b){
        println(">")
    } else if (a == b){
        println("==")
    } else {
        println("<")
    }
}
