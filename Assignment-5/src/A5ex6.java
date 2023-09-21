package src;

public class A5ex6 {
    A5ex6(String value){
        System.out.println(value+" Class Constructor");
    }
}
class Sub extends A5ex6{
    Sub(){
        super("Super");
    }
    public static void main(String[] args){
        Sub obj = new Sub();
    }
}
