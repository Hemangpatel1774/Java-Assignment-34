import java.util.Scanner;
public class ex16{
    public static String len_of_string(String a){
        return "Length of \""+a+"\" is "+a.length()+".";
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The String : ");
        String a = sc.next();
        System.out.println(len_of_string(a));
    }
}
