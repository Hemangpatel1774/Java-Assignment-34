import java.util.Scanner;
public class Ex____15 {
    static double area(int b , int h){
        return 0.5*b*h;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("----Enter The Parameters----");
        System.out.print("Height : ");
        int h = sc.nextInt();
        System.out.print("Base : ");
        int b = sc.nextInt();
        System.out.println("Area of Triangle is "+area(b,h));
    }
}
