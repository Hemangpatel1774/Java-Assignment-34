package Overridepackage;
import Realpackage.MakePrivate;
public class PrivateOverride extends MakePrivate{
    private void display() {
        System.out.println("Method Override in Different Package by using 'Private' Accessibility.");
    }
    public static void main(String[] args) {
        PrivateOverride obj = new PrivateOverride();
        obj.display();
    }
}
