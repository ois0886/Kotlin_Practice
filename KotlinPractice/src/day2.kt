fun main(args: Array<String>) {
    // 메인함수 (프로그램 시작점)
    // 변수( String, Int, Boolean, Double, Float..)
    // val , var
    val a: String = "abc"
    //a = "adadadadad" // 오류 발생
    var b: String
    b = "adadadadada"
    b = "dedede" // 오류가 발생하지 않음

    aFunction(a = 1, b = 2) // 함수 호출 사용
    println(aFunction5Print())
}

// 함수 (function) - > fun
fun aFunction(a: Int, b: Int): Unit { // Unit = void
    println("체크")
    println("체크")
    println("체크")
    println("체크")
    println("체크")
}

fun aFunction5Print(): String {
    println("hello")
    println("hello")
    println("hello")
    println("hello")
    println("hello")
    return "android"
    // return 의 개념 : 호출처로 함수에서 만들어낸 결과 값을 되돌려 줌
}