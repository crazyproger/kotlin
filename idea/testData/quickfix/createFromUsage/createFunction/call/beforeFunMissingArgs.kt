// "Create function 'foo' from usage" "true"

class A<T>(val n: T) {
    fun foo(i: Int, s: String): A<T> = throw Exception()
}

fun test() {
    val a: A<Int> = A(1).foo(2<caret>)
}