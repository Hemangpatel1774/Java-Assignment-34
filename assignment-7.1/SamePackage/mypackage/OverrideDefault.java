package mypackage;
import mypackage.UseDefault;
public class OverrideDefault extends UseDefault{
    void show(){
        word += " ,Method Override by using 'Default' Accessibility.";
        System.out.println(word);
    }
    public static void main(String[] args) {
        OverrideDefault obj = new OverrideDefault();
        obj.show();
    }
}
