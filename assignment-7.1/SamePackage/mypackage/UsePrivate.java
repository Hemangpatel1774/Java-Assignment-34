package mypackage;

public class UsePrivate {
    String string = "Hello world";
    private void show(){
        System.out.println(string);
    }
    public static void main(String[] args){
        UsePrivate obj = new UsePrivate();
        obj.show();
    }
}
