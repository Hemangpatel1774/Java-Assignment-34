package Overridepackage;
import Realpackage.MakeDefault;

import java.rmi.AccessException;

public class DefaultOverride extends MakeDefault{
    void display() {
            System.out.println("Method Override in Different Package by using 'Default' Accessibility.");
    }
    public static void main(String[] args) {
       DefaultOverride obj = new DefaultOverride();
        obj.display();
    }
}
