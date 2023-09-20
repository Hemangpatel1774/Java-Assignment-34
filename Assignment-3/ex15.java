import java.util.Scanner;
public class ex15{
    public static String len_of_string(String a){
        int len=0;
        char[] arr = a.toCharArray();
        for(char i: arr){
            len++;
        }
        return "Length of \""+a+"\" is "+len+".";
        }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The String : ");
        String a = sc.next();
        System.out.println(len_of_string(a));
    }
}
