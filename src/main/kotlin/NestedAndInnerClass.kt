
/***
 * Nested Class :-
 * A nested class is just like a static class in Java —
 * it does not have access to the outer class's members.
 * */

/***
 * Inner Class :-
 * An inner class is marked with the inner keyword and
 * can access the outer class’s members, including private ones.
 * */

/*
Feature	                        Nested Class	 Inner Class
Defined using	                class Nested	 inner class Inner
Access outer members	        ❌ Not allowed	 ✅ Allowed
Requires outer class instance	❌ No	         ✅ Yes
*/

fun main(){

    val nested = NOuter.Nested()
    println(nested.display())

    val outer = Outer()
    val inner = outer.Inner()
    println(inner.display())

}

class NOuter {
    val name = "Outer Class"

    class Nested {
        fun display() = "Nested class function "
    }
}

class Outer {
    private val name = "Outer Class"
    inner class Inner {
        fun display() = "Accessing: $name"
    }
}

