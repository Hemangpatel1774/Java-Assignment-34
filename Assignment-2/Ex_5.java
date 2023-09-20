// Swapping with temp :-
import java.util.Scanner;
public class Ex_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("----Swap to Numbers----");
        System.out.print("Number-1 : ");
        int num_1 = sc.nextInt();
        System.out.print("Number-2 : ");
        int num_2 = sc.nextInt();
        System.out.println("Before the Swapping: Number-1 = "+num_1+" , Number-2 = "+num_2+".");
        int temp = num_1;
        num_1 = num_2;
        num_2 = temp;
        System.out.println("After the Swapping: Number-1 = "+num_1+" , Number-2 = "+num_2+".");
    }
}
