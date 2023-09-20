import java.util.Scanner;
public class Ex_16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Year : ");
        int Year = sc.nextInt();
        if (Year%100==0){
            if (Year%400==0){
                System.out.println(Year+" is Leap Year.");
            }
            else {
                System.out.println(Year+" isn't Leap Year.");
            }
        } else if (Year%4==0){
            System.out.println(Year+" is Leap Year.");
        }
        else {
            System.out.println(Year+" isn't Leap Year.");
        }
    }
}