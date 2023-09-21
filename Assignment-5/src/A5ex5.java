package src;

class Test{
    void Display(String str) {
        System.out.println("Parent class's Method called by "+str);
    }
}
class Child_1 extends Test{
    void show1(){
        Display("Child-1");
    }
}
class Child_2 extends Test{
    void show2(){
        Display("Child-2");
    }
}
public class A5ex5{
    public static void main(String[] args) {
        Child_1 obj = new Child_1();
        Child_2 obj2 = new Child_2();

        obj.show1();
        obj2.show2();

    }
}

