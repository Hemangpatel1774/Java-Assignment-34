package mypackage;
import mypackage.OverridePrivate;

public class OverridePrivate extends UsePrivate{
    private void show(){
        string += " ,Method Override by using 'Private' Accessibility.";
        System.out.println(string);
    }
    public static void main(String[] args) {
        OverridePrivate obj = new OverridePrivate();
        obj.show();
    }
}
