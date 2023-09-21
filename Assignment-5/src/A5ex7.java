package src;

abstract class Shape {
    abstract double area(float b , float h);
}
class Triangle extends Shape{
   @Override
   double area(float b , float h){
        return 0.5*b*h;
    }
}
class Rectangle extends Shape{
    @Override
    double area(float h , float w){
        return w*h;
    }
}
class Circle extends Shape{
    @Override
     double area(float r,float pi){
        return pi*r*r;
    }
}
public class A5ex7{
    public static void main(String[] args){
        float pi = 3.1428f;
        Triangle tr = new Triangle();
        Rectangle rc = new Rectangle();
        Rectangle cr = new Rectangle();
        double Area_of_Triangle =tr.area(10,15);
        double Area_of_Rectangle = rc.area(10 , 20);
        double Area_of_Circle = cr.area(10,pi);
        System.out.println("Area of Triangle is "+Area_of_Triangle);
        System.out.println("Area of Rectangle is "+Area_of_Rectangle);
        System.out.println("Area of Circle is "+Area_of_Circle);
    }
}