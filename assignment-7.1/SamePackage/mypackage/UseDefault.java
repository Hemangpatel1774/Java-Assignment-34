package mypackage;

public class UseDefault {
     String word = "Hello world";
    void show(){
        System.out.println(word);
    }
    public static void main(String[] args) {
        UseDefault obj = new UseDefault();
        obj.show();
    }
}
