package Overridepackage;

import Realpackage.MakeProtect;
public class ProtectOverride extends MakeProtect {
    protected void display() {
        System.out.println("Method Override in Different Package by using 'Private' Accessibility.");
    }
    public static void main(String[] args) {
        ProtectOverride obj = new ProtectOverride();
        obj.display();
    }
}
