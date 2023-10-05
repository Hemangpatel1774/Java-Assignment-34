package mypackage;
import mypackage.UsePrivate;

public class OverridePrivate extends UsePrivate{
    private void show(){
        System.out.println("Method Override by using 'Private' Accessibility.");
    }
    public static void main(String[] args) {
        UsePrivate obj = new OverridePrivate();
        //obj.show();
        System.out.println("Private Method cannot be access outside the Class.");
    }
}
