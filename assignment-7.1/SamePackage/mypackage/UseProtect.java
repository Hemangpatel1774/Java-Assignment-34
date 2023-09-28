package mypackage;

public class UseProtect {
    String string = "Hello world";
    protected void show(){
        System.out.println(string);
    }
    public static void main(String[] args){
        UseProtect obj = new UseProtect();
        obj.show();
    }
}
