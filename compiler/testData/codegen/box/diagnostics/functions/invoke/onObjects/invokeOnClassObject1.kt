class A {
    companion object {
        fun invoke(i: Int) = i
    }
}

fun box() = if (A(42) == 42) "OK" else "fail"

