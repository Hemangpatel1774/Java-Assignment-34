import java.util.Scanner;
public class Ex_11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Weight : ");
        int num = sc.nextInt();
        if(num%7==0){
            System.out.println(num+" is Divisible By 7.");
        }else {
            System.out.println(num+" isn't Divisible By 7.");
        }
    }

}
