sealed class BaseClass {
    class SubClass1 : BaseClass() {}
    class SubClass2 : BaseClass() {}
    class SubClass3 : BaseClass() {}
}

fun show(objectOfBaseClass: BaseClass) {
    when (objectOfBaseClass) {
        is BaseClass.SubClass1 -> println("Subclass1")
        is BaseClass.SubClass2 -> println("Subclass2")
        is BaseClass.SubClass3 -> println("Subclass3")
    }

}

fun main(args: Array<String>) {
    val a = BaseClass.SubClass1()
    val b = BaseClass.SubClass2()
    val c = BaseClass.SubClass3()
    show(a)
    show(b)
    show(c)
}



