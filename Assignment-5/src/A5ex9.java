package src;

interface first{
    String str = "This is First interface";
    void display();
}
interface second{
    String str = "This is Second interface";
    void display_new();
}
class sub_class implements first , second{
    public void display(){
        System.out.println(first.str);
    }
    public void display_new() {
        System.out.println(second.str);
    }
}
public class A5ex9 {
    public static void main(String[] args){
        sub_class obj = new sub_class();
        obj.display();
        obj.display_new();
    }
}
