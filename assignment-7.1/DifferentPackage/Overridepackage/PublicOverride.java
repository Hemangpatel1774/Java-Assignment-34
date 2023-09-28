package Overridepackage;
import Realpackage.MakePublic;
public class PublicOverride extends MakePublic{
    public void display(){
        str += " ,Method Override in Different Package by using 'Public' Accessibility.";
        System.out.println(str);
    }
    public static void main(String[] args) {
        PublicOverride obj = new PublicOverride();
        obj.display();
    }
}
