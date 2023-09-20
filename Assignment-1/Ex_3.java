import java.util.Scanner;
public class Ex_3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Amount : ");
        float Amount = sc.nextFloat();
        System.out.print("Enter The Rate : ");
        float Rate = sc.nextFloat();
        System.out.print("Enter The Month : ");
        float Month = sc.nextFloat();
        float intrest = (Amount*Rate*Month)/1200;
        System.out.println("intrest : "+intrest);
    }
}
