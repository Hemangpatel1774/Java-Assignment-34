public class Ex____8 {
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
        Ex____8 obj1 = new Ex____8();
        Ex____8 obj2 = new Ex____8();
        Ex____8 obj3 = new Ex____8();
        obj1.insert(10);
        obj2.insert(5);
        obj3.insert(7);
        obj1.display();
        obj2.display();
        obj3.display();
    }

}
