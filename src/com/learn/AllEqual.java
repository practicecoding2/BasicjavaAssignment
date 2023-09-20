package com.learn;
import java.util.Scanner;



public class AllEqual {
    public static void main(String[] args) {
        Scanner obj1=new Scanner(System.in);
    System.out.println("Enter first variable a");
    String a=obj1.nextLine();
        System.out.println("Enter first variable b");
        String b=obj1.nextLine();
        System.out.println("Enter first variable c");
        String c=obj1.nextLine();



    //

        if (a == b && a == c) {
            System.out.println("all equal");
        }
        else {
            System.out.println("not all equal");
        }

    }


}


