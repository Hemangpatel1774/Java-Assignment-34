package src;

public class A5ex3 {
    A5ex3(){
        System.out.println("-----Without parameterized Constructor-----");
    }
    A5ex3(int a){
        System.out.println("-----One parameterized Constructor-----");
    }
    A5ex3(int a, int b){
        System.out.println("-----Two parameterized Constructor-----");
    }
    public static void main(String[] args) {
        A5ex3 obj1 = new A5ex3();
        A5ex3 obj2 = new A5ex3(10);
        A5ex3 obj3 = new A5ex3(10,20);
    }
}
