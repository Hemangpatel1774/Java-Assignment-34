package Realpackage;

public class MakePublic {
    public void display(){
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        MakePublic obj = new MakePublic();
        obj.display();
    }
}
