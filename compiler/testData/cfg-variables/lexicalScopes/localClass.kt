fun foo() {
    "before"
    class A(val x: Int) {
        {
            val a = x
        }
        fun foo() {
            val b = x
        }
    }
    "after"
}