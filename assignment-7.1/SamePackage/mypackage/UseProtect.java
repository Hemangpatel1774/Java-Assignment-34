package mypackage;

public class UseProtect {
    protected void show(){
        System.out.println("Hello world");
    }
    public static void main(String[] args){
        UseProtect obj = new UseProtect();
        obj.show();
    }
}
