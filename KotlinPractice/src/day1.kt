fun main(args: Array<String>) {
    // 프로그램 시작지점(Entry Point)
    print("코틀린")
    println("Hello World!")
    println("Hello Kotlin")

    // val : 변수에 값을 할당하게되면 다시 재 할당을 시킬 수 없다.
    val a: Int = 1 // 변수 선언 및 초기화를 한번에 !
    println(a)

    val b = 2 // 타입을 지정 안하고 변수에 값을 할당(초기화) !
    println(b)

    val c: Int // 변수(Integer)
    c = 3
    println(c)

    // var : 변수에 값을 재 할당 가능
    var d = 3
    d = 5
    println(d)

    var e: String = "안녕하세요"
    println(e)
    e = "Hello World!!"
    println(e)

    // boolean(논리를 따짐 !) true(진실) 아니면 false(거짓)
    var r: Boolean = false

    // 불리언 변수는 경우의 수를 따질 때 많이 쓰게됨..!!
    // float, double 소수
    var g: Float = 0.1F
    println(g)
    println(d + g)

    var h: Double = 0.2323232323
    println(h)

}
