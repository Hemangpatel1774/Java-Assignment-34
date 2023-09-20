import java.util.Scanner;
public class Ex_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First Number : ");
        int num1 = sc.nextInt();
        System.out.print("Second Number : ");
        int num2 = sc.nextInt();
        System.out.print("Third Number : ");
        int num3 = sc.nextInt();
        if (num1>num2 & num1>num3){
            System.out.println(num1+" is Maximum number.");
        }
        else if (num2>num1 & num2>num3){
            System.out.println(num2+" is Maximum number.");
        }
        else if (num3>num1 & num3>num2){
            System.out.println(num3+" is Maximum number.");
        }
        else {
            if(num1>num2){
                System.out.println("First and Third Numbers are Equal and They are Maximum.");
            } else if (num1<num2) {
                System.out.println("Second and Third Numbers Are Equal and They are Maximum.");
            }
            else if (num1>num3){
                System.out.println("First and Second Numbers Are Equal and They are Maximum.");
            }
            else {
                System.out.println("First , Second And Third All are Equal Numbers.");
            }
        }
    }
}
