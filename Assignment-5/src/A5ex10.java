package src;

import java.lang.Math;
public class A5ex10 {
    public static void main(String[] args){
        System.out.println("\n--------Basic Math Methods--------");
        double a =-10.43;
        System.out.println("abs(-10.43) = "+Math.abs(a));
        float b = 10.67f;
        System.out.println("ceil(10.67f) = "+Math.ceil(b));
        System.out.println("floor(10.67f) = "+Math.floor(b));
        System.out.println("rint(10.67f) and rint(10.34f) = "+Math.rint(b)+" and "+Math.rint(10.34));
        System.out.println("round(10.28) and round(10.52)= "+Math.round(10.28)+" and "+Math.round(10.52));
        System.out.println("min(10,14) = "+Math.min(10,14));
        System.out.println("max(10,14) = "+Math.max(10,14));
        System.out.println("\n--------Exponential and Logarithmic Methods--------");
        System.out.printf("Natural logarithms = %.4f%n",Math.E);
        System.out.printf("PI = %.4f%n",Math.PI);
        System.out.printf("exp() = %.3f%n", Math.exp(1.1));
        System.out.printf("pow() = %.2f%n",Math.pow(5,3));
        System.out.printf("sqrt() = %.3f%n",Math.sqrt(2));
        double degree = 45;
        double radians = Math.toRadians(degree);
        System.out.println(Math.toRadians(45));
        System.out.format("sin of %.0f is %.4f%n.",degree,Math.sin(radians));
        System.out.format("cos of %.0f is %.4f%n.",degree,Math.cos(radians));
        System.out.format("tan of %.0f is %.4f%n.",degree,Math.tan(radians));
        System.out.format("The arcsine of %.4f " + "is %.4f degrees %n", Math.sin(radians),Math.toDegrees(Math.asin(Math.sin(radians))));
        System.out.format("The arccosine of %.4f " + "is %.4f degrees %n", Math.cos(radians), Math.toDegrees(Math.acos(Math.cos(radians))));
        System.out.format("The arctangent of %.4f " + "is %.4f degrees %n", Math.tan(radians),Math.toDegrees(Math.atan(Math.tan(radians))));
        System.out.println("\n------- Random Number -------");
        System.out.printf("random()*10 = %.0f",Math.random()*15);
    }
}
