import java.util.Scanner;
public class Ex_12{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int num = sc.nextInt();
        if(num%2==0) {
            System.out.println(num+" is Even.");
        }else System.out.println(num+" is odd.");
    }
}
