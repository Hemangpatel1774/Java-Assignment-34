import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int num = sc.nextInt();
        String Result = (num%2==0)? "Even" : "Odd";
        System.out.println(num+" is "+Result);
    }
}
