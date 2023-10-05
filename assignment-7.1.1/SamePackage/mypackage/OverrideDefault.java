package mypackage;
import mypackage.UseDefault;
public class OverrideDefault extends UseDefault{
    void show(){
        System.out.println("Method Override by using 'Default' Accessibility.");
    }
    public static void main(String[] args) {
        UseDefault obj = new OverrideDefault();
        obj.show();
    }
}
