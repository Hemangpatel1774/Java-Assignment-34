package Realpackage;

public class MakeProtect {
    protected void display(){
        System.out.print("Hello");
    }
    public static void main(String[] args) {
        MakeProtect obj = new MakeProtect();
        obj.display();
    }
}
