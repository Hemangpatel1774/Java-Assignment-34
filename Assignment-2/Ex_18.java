import java.util.Scanner;
public class Ex_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First Number : ");
        int num1 = sc.nextInt();
        System.out.print("Second Number : ");
        int num2 = sc.nextInt();
        System.out.print("Third Number : ");
        int num3 = sc.nextInt();
        if (num1>num2 & num1>num3){
            System.out.println("First is Greatest number.");
            if (num2>num3){
                System.out.println("Third is Least number.");
            } else if (num2<num3) {
                System.out.println("Second is Least number.");
            }else {
                System.out.println("Second and Third Both are Least numbers.");
            }
        }
        else if (num2>num1 & num2>num3){
            System.out.println("Second is Greatest number.");
            if (num1>num3){
                System.out.println("Third is Least number.");
            } else if (num1<num3) {
                System.out.println("First is Least number.");
            }else {
                System.out.println("First and Third Both are Least numbers.");
            }
        }
        else if (num3>num1 & num3>num2){
            System.out.println("Third is Greatest number.");
            if (num2>num1){
                System.out.println("First is Least number.");
            } else if (num2<num1) {
                System.out.println("Second is Least number.");
            }else {
                System.out.println("First and Second Both are Least numbers.");
            }
        }
        else {
            if(num1>num2){
                System.out.println("First and Third Numbers are Equal and They are Greatest Numbers.");
                System.out.println("Second is Least Number.");
            } else if (num1<num2) {
                System.out.println("Second and Third Numbers Are Equal and They are Greatest Numbers.");
                System.out.println("First is Least Number.");
            }
            else if (num1>num3){
                System.out.println("First and Second Numbers Are Equal and They are Greatest Numbers.");
                System.out.println("Third is Least Number.");
            }
            else {
                System.out.println("First , Second And Third All are Equal Numbers.");
            }
        }
    }
}
