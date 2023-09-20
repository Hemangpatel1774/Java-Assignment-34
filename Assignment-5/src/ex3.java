public class ex3 {
    ex3(){
        System.out.println("-----Without parameterized Constructor-----");
    }
    ex3(int a){
        System.out.println("-----One parameterized Constructor-----");
    }
    ex3(int a,int b){
        System.out.println("-----Two parameterized Constructor-----");
    }
    public static void main(String[] args) {
        ex3 obj1 = new ex3();
        ex3 obj2 = new ex3(10);
        ex3 obj3 = new ex3(10,20);
    }
}
