package Overridepackage;
import Realpackage.MakeProtect;
class ProtectOverride extends MakeProtect {
    @Override
    protected void display() {
        System.out.println("Method Override in Different Package by using 'Protected' Accessibility.");
    }
    public static void main(String[] args) {
        ProtectOverride obj = new ProtectOverride();
        obj.display();
    }
}
