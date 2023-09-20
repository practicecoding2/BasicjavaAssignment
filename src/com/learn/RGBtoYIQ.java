package com.learn;

public class RGBtoYIQ {

        public static void main(String[] args) {
            int red = 123;
            int green = 66;
            int blue = 222;

            double y, i, q;


            double r = red / 255.0;
            double g = green / 255.0;
            double b = blue / 255.0;


            y = 0.299 * r + 0.587 * g + 0.114 * b;
            i = 0.596 * r - 0.275 * g - 0.321 * b;
            q = 0.212 * r - 0.523 * g + 0.311 * b;


            System.out.println("Y: " + y);
            System.out.println("I: " + i);
            System.out.println("Q: " + q);
        }
    }


