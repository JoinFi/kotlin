// "Create function 'foo'" "true"

class A<T>(val n: T) {
    fun foo(arg: T): A<T> {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

fun test() {
    val a: A<Int> = A(1).foo(2)
}