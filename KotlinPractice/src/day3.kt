fun main(args: Array<String>) {

    val person: Person = Person() // 클래스 인스턴스 생성
    person.name = "인성"
    person.age = 28
    person.hobby = "coding"
    person.walk("인성") // Call Function
    person.stop("인성")
    person.greet("인성")

}

// 설계도 (bluePrint)
class Person {
    // 상태에 대한 정의
    var name: String = ""
    var age: Int = 0
    var hobby: String = ""

    // 행동에 대한 정의
    fun walk(name: String) {
        println("$name WALK !!")
    }

    fun stop(name: String) {
        println("$name STOP !!")
    }

    fun greet(name: String) {
        println("$name GREET !!")
    }

}