package Part_Three_Java_Versions_And_Background.Object_Oriented_Concepts.Polymorphism.Overriding;



// A Simple Java program to demonstrate
// method overriding in java

// Base Class
class Parent {
    void show() {
        System.out.println("Parent's show()");
    }
}

// Inherited class
class Child extends Parent {
    // This method overrides show() of Parent
    @Override
    void show() {
        System.out.println("Child's show()");
    }
}

// Driver class
class ExampleThree {
    public static void main(String[] args) {
        // If a Parent type reference refers
        // to a Parent object, then Parent's
        // show is called
        Parent obj1 = new Parent();
        obj1.show();

        // If a Parent type reference refers
        // to a Child object Child's show()
        // is called. This is called RUN TIME
        // POLYMORPHISM.
        Parent obj2 = new Child();
        obj2.show();
    }
}


//
/*
 * 
 * // Final methods can not be overridden : If we don’t want a method to be
 * // overridden, we declare it as final.
 * 
 * // Static methods can not be overridden(Method Overriding vs Method Hiding) :
 * // When you define a static method with same signature as a static method in
 * // base class, it is known as method hiding.
 * 
 * 
 * Private methods can not be overridden : Private methods cannot be overridden
 * as they are bonded during compile time. Therefore we can’t even override
 * private methods in a subclass.(See this for details).
 * 
 * 
 * The overriding method must have same return type (or subtype) : From Java 5.0
 * onwards it is possible to have different return type for a overriding method
 * in child class, but child’s return type should be sub-type of parent’s return
 * type. This phenomena is known as covariant return type.
 * 
 * 
 * Invoking overridden method from sub-class : We can call parent class method
 * in overriding method using super keyword.
 * 
 * Overriding and constructor : We can not override constructor as parent and
 * child class can never have constructor with same name(Constructor name must
 * always be same as Class name).
 * Overriding and Exception-Handling : Below are two rules to note when
 * overriding methods related to exception-handling.
 * Rule#1 : If the super-class overridden method does not throw an exception,
 * subclass overriding method can only throws the unchecked exception, throwing
 * checked exception will lead to compile-time error.
 * 
 * Rule#2 : If the super-class overridden method does throws an exception,
 * subclass overriding method can only throw same, subclass exception. Throwing
 * parent exception in Exception hierarchy will lead to compile time error.Also
 * there is no issue if subclass overridden method is not throwing any
 * exception.
 * 
 * Overriding and abstract method: Abstract methods in an interface or abstract
 * class are meant to be overridden in derived concrete classes otherwise a
 * compile-time error will be thrown.
 * 
 * 
 * Overriding and synchronized/strictfp method : The presence of
 * synchronized/strictfp modifier with method have no effect on the rules of
 * overriding, i.e. it’s possible that a synchronized/strictfp method can
 * override a non synchronized/strictfp one and vice-versa.
 */