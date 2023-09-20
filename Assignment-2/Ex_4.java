// Area of Circle :-
import java.util.Scanner;
public class Ex_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("----Circle----");
        System.out.print("radius : ");
        float radius = sc.nextFloat();
        double area = 3.142*radius*radius;
        System.out.println("Area of Circle is "+area);
    }
}
