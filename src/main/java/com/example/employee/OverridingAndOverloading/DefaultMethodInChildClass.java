package com.example.employee.OverridingAndOverloading;

interface A {
    default void show(){
        System.out.println("show in interface");
    }
}

class B implements A {
    public void show() {
        System.out.println("show");
    }

    void print() {
        System.out.println("print");
    }
}
public class DefaultMethodInChildClass {
    public static void main(String... args) {
        A a = new B();
  //      a.print(); will throws us compile time error
    }
}
