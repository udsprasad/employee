package com.example.employee.OverridingAndOverloading;

class Parent1 {
    int x = 10;
}

class Child1 extends Parent1 {
    int x = 20;
}

// Fields are not polymorphic.
//
//Compile-time type is Parent.
//
//Output: 10
public class FieldHiding {
    public static void main(String[] args) {
        Parent1 p = new Child1();
        System.out.println(p.x); // ???
    }
}

