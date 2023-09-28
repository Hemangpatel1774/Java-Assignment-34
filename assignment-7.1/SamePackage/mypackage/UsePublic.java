// Use Public Accessibility :
package mypackage;

public class UsePublic {
    String str = "Hello";
    public void display(){

        System.out.println(str);
    }
    public static void main(String[] args) {
        UsePublic obj = new UsePublic();
        obj.display();
    }
}
