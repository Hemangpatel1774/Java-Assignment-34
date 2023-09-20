//Area Of Circle:
import java.util.Scanner;
public class Ex_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Radius : ");
        float Radius = sc.nextFloat();
        double pi = 3.142;
        double Area = pi*Radius*Radius;
        System.out.println("Area : "+Area);

    }
}
