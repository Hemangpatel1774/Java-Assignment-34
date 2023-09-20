public class Ex____9 {
    int radius ;
    double pi = 3.14;
    void insert(int r){
        radius = r;
    }
    void display(){
        System.out.println("\nRadius of Square : "+radius);
        System.out.println("Area      : "+(pi*radius*radius));
        System.out.println("perimeter : "+(2*pi*radius));
    }
    public static void main(String[] args){
        Ex____9 obj1 = new Ex____9();
        Ex____9 obj2 = new Ex____9();
        Ex____9 obj3 = new Ex____9();
        obj1.insert(10);
        obj2.insert(5);
        obj3.insert(7);
        obj1.display();
        obj2.display();
        obj3.display();
    }
}
