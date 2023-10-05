package Overridepackage;
import Realpackage.MakeDefault;

import java.rmi.AccessException;

public class DefaultOverride extends MakeDefault{
    void display() {
            System.out.println("Method Override in Different Package by using 'Default' Accessibility.");
    }
    public static void main(String[] args) {
       MakeDefault obj = new DefaultOverride();
        //obj.display();
        System.out.println("Default Method cannot be access in Different Package.");
    }
}
