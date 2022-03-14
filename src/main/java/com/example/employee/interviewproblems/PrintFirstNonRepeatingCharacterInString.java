package com.example.employee.interviewproblems;

public class PrintFirstNonRepeatingCharacterInString {
    public static void main(String[] args){
        String name ="RamaRaju";
        for(String s: name.split("")){
          if(name.indexOf(s)==name.lastIndexOf(s)){
              System.out.println(s);
              break;
          }
        }
    }
}
