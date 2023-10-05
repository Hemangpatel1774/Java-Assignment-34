package mypackage;

public class UsePrivate {
    private void show(){
        System.out.println("Hello world");
    }
    public static void main(String[] args){
        UsePrivate obj = new UsePrivate();
        obj.show();
    }
}
