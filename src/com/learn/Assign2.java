package com.learn;

public class Assign2 {

    //(!(a < b) && !(a > b))
    //Solution: (a == b)
    public static void main(String[]args){
        int a,b;
        a=10;
        b=7;
        boolean result=(!(a<b)&&!(a>b));
        System.out.println("a="+a);
        System.out.println("b="+b);
        boolean simplifiedExpression = (a == b);
        System.out.println("Result="+result);

    }

}
