package com.company;

public class Methods {
    public static void main(String[] args){
            method1(4);
            int m2 = method2("Alexander Hamilton", 7);
            System.out.println("method 2 return " + m2);
            double m3 = method3(m2, 3.14);
            System.out.println("method 3 returns " + m3);
    }
    public static double method3(int y, double z){
        double result = (z*y+7);
        return result;
    }

    public static int method2(String name, int x){
        System.out.println("Hello " + name);
        return x%2;

    }

    public static void method1(int x){
        int y = x*x+2;
        System.out.println("squared plus 2 " + y);
    }


}
