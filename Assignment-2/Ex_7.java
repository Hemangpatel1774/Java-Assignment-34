import java.util.Scanner;
public class Ex_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Weight : ");
        float Weight = sc.nextFloat();
        System.out.print("Enter Your height : ");
        float height = sc.nextFloat();
        float BMI = Weight / (height*height);
        System.out.print("BMI is "+BMI);
    }
}
