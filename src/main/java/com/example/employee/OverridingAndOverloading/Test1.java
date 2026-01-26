package com.example.employee.OverridingAndOverloading;

class Parent {
    void show(int x) { System.out.println("Parent int"); }
    void show(Object o) { System.out.println("Parent Object"); }
}

class Child extends Parent {
    void show(Integer x) { System.out.println("Child Integer"); }
}
// Same method name ✅
//
//Different parameter list (type, number, or order) ✅
//
//Return type can differ, but alone does not count for overloading
//
//Access modifiers can differ
//
//Overloading can happen in the same class or in a subclass
public class Test1 {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show(10); // ???
    }
}

