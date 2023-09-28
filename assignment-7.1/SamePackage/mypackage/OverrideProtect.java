package mypackage;
import mypackage.UseProtect;
public class OverrideProtect extends UseProtect {
    protected void show(){
        string += " ,Method Override by using 'Protected' Accessibility.";
        System.out.println(string);
    }
    public static void main(String[] args) {
        OverrideProtect obj = new OverrideProtect();
        obj.show();
    }
}
