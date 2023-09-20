// Area of Rectangle :-
import java.util.Scanner;
public class Ex_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("----Rectangle----");
        System.out.print("Length : ");
        float length = sc.nextFloat();
        System.out.print("Width : ");
        float width = sc.nextFloat();
        Double area = 0.5*length*width;
        System.out.println("Area of Rectangle is "+area);
    }
}
