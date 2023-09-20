import java.util.Scanner;
public class Ex_9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        int num2 = sc.nextInt();
        int Product = 0;
        for(int i = 0 ; i < num2 ; i++){
            Product += num1;
        }
        System.out.println("Product Of "+num1+" And "+num2+" is "+Product);
    }
}