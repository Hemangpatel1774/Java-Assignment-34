import java.util.Scanner;
public class Ex_13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int num = sc.nextInt();
        if(num>0) {
            System.out.println(num+" is +ve.");
        }
        else if (num<0){
            System.out.println(num+" is -ve.");
        }else {
            System.out.println(num+" is Zero.");
        }
    }
}
