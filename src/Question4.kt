class Question4 {
    fun show() {
        println("THis is not extension function")
    }
}

fun main(args: Array<String>) {
    fun Question4.display() {
        println("extension function")
    }

    val question4 = Question4()
    question4.display()
    question4.show()
}