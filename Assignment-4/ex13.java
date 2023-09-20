public class ex13 {
    static int count = 0;
    ex13(){
        count++;
    }
    public static void main(String[] args){
        ex13 obj1 = new ex13();
        ex13 obj2 = new ex13();
        ex13 obj3 = new ex13();
        ex13 obj4 = new ex13();
        System.out.println("No. of Objects are "+count+".");
    }
}
