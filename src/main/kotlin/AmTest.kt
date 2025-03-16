fun main(){

    // A is public.
    val a = A()
    a.info()
    a.secretInfo()

    // a is public and d is internal (public within module)
    println(a.a + a.d)

    val b = B()
    b.info()
    b.secretInfo()

    // val c = C()

    val d = D()

}

