package Realpackage;

public class MakePublic {
    public String str = "Hello";
    public void display(){
        System.out.println(str);
    }
    public static void main(String[] args) {
        MakePublic obj = new MakePublic();
        obj.display();
    }
}
