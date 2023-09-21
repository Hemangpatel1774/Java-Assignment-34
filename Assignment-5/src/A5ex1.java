package src;

public class A5ex1 {
    private String str;
    A5ex1(String str){
        this.str = str;
    }
    public static void main(String[] args){
        A5ex1 obj1 = new A5ex1("Hello World!");
        System.out.println(obj1.str);
    }
}
