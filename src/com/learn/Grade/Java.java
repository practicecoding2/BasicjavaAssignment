package com.learn.Grade;

public class Java {

     public static void main(String[] args) {


         int grade = 45;

         boolean isA = (90 <= grade && grade <= 100);
         System.out.println(isA);
         if (isA) {
             System.out.println("Grade is A");
         } else {
             System.out.println("Grade is not A");
         }

    }
}
