import java.util.Scanner;
public class Ex_27{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Amount : ");
        float Amount = sc.nextFloat();
        System.out.print("Enter The Rate : ");
        float Rate = sc.nextFloat();
        if (0>Rate || Rate>10){
            System.out.println("Interest must be Between 0 to 10%");
        }else{
            System.out.print("Enter The Month : ");
            float Month = sc.nextFloat();
            float interest = (Amount*Rate*Month)/1200;
            System.out.println("intrest : "+interest);
        }
    }

}
