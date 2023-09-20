import java.util.Scanner;
public class Ex_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int num = sc.nextInt();
        int Factorial = 1;
        while(num>=1){
            Factorial *=num;
            num--;
        }
        System.out.println(Factorial);
    }
}