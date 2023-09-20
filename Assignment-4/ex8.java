public class ex8 {
    int len ;
    void insert(int l){
        len = l;
    }
    void display(){
        System.out.println("Length of Square : "+len);
        System.out.println("Area      : "+(len*len));
        System.out.println("perimeter : "+(len*4));
    }
    public static void main(String[] args){
        ex8 obj1 = new ex8();
        ex8 obj2 = new ex8();
        ex8 obj3 = new ex8();
        obj1.insert(10);
        obj2.insert(5);
        obj3.insert(7);
        obj1.display();
        obj2.display();
        obj3.display();
    }

}
