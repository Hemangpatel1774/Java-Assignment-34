package mypackage;
import mypackage.UseProtect;
public class OverrideProtect extends UseProtect {
    protected void show(){
        System.out.println("Method Override by using 'Protected' Accessibility.");
    }
    public static void main(String[] args) {
        UseProtect obj = new OverrideProtect();
        obj.show();
    }
}
