//Swap Two number Using Temp Variable:
public class Ex_6 {
    public static void main(String[] args){
        byte a = 10;
        byte b = 20;
        System.out.println("Before : a = "+a+" And b = "+b);
        byte Temp = 10;
        a = b;
        b = Temp;
        System.out.println("After : a = "+a+" And b = "+b);
    }
}
