package Realpackage;

public class MakePrivate {
    private void display(){
        System.out.print("Hello ");
    }
    public static void main(String[] args) {
        MakePrivate obj = new MakePrivate();
        obj.display();
    }
}

