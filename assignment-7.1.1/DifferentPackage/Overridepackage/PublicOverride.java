package Overridepackage;
import Realpackage.MakePublic;
public class PublicOverride extends MakePublic{
    public void display(){
        System.out.println("Method Override in Different Package by using 'Public' Accessibility.");
    }
    public static void main(String[] args) {
        PublicOverride obj = new PublicOverride();
        obj.display();
    }
}
