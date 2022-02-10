package com.example.employee.Aop;

public class DemoAOP {
    private static int data=1;
    void display(){
        System.out.println(data);
    }
    static class Inner{
        void show(){
            System.out.println(data);

        }
    }
    public static void main(String[] args){
        DemoAOP.Inner d= new DemoAOP.Inner();
            }
}
