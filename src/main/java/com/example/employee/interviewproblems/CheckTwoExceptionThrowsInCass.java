package com.example.employee.interviewproblems;

class Parent extends Exception{

}
class Child extends Parent {

}
public class CheckTwoExceptionThrowsInCass {
    public static void main(String[] args) {
        try{
            throw new Child();
            //throw new Parent();
        } catch (Child child) {
            System.out.println("Child");
        }/* catch (Parent parent) {
            System.out.println("parent");
        }*/

    }
}
