package mypackage;
import mypackage.UsePublic;

public class OverridePublic extends UsePublic{
    public void display(){
        str += " ,Method Override by using 'Public' Accessibility.";
        System.out.println(str);
    }
    public static void main(String[] args) {
        OverridePublic obj = new OverridePublic();
        obj.display();
    }
}
