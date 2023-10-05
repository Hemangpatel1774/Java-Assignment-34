// Use Public Accessibility :
package mypackage;

public class UsePublic {
    public void display(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        UsePublic obj = new UsePublic();
        obj.display();
    }
}
