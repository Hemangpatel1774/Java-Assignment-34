import java.util.Scanner;
public class Ex2_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Amount , Time[Month] and Rate by giving space: ");
        int amt = sc.nextInt();
        int month = sc.nextInt();
        float rate = sc.nextFloat();
        double interest = amt*month*rate/1200;
        System.out.printf("Interest : %.3f /-",interest);
    }
}
