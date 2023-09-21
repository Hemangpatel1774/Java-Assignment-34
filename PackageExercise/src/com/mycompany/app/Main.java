package com.mycompany.app;
import com.mycompany.math.Calculator;
public class Main {
    public static void main(String[] args){
        Calculator cl = new Calculator();
        System.out.println("Sum of 10 and 5 is "+cl.add(10,5));
        System.out.println("Subtract 7 from 20 is "+cl.subtract(20,7));
    }
}
