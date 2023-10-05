package mypackage;
import mypackage.UsePublic;

public class OverridePublic extends UsePublic{
    public void display(){
        System.out.println("Method Override by using 'Public' Accessibility.");
    }
    public static void main(String[] args) {
        UsePublic obj = new OverridePublic();
        obj.display();
    }
}
