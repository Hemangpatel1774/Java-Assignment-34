//Swap Two Number Without Using Temp Variable:
public class Ex_7 {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        System.out.println("Before : a = "+a+" And b = "+b);
        a *= b;
        b = a/b;
        a = a/b;
        System.out.println("After : a = "+a+" And b = "+b);
    }
}
