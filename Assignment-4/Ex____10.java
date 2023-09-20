public class Ex____10 {
    int len ;
    int wid ;
    int base ;
    int hig;
    double pi = 3.14;
    int radius;
    Ex____10(int a, String t){
        if (t=="circle"){
            radius = a;
            System.out.println("\nRadius of Circle : "+radius);
            System.out.println("Area      : "+(pi*radius*radius));
        }
        else{
            len = a ;
            System.out.println("\nLength of Square : "+len);
            System.out.println("Area      : "+len*len);
        }
    }
    Ex____10(int a, int b, String t){
        if (t=="rectangle"){
            len = a;
            wid = b;
            System.out.println("\nLength and Width of Rectangle : "+len+" and "+wid);
            System.out.println("Area      : "+(len*wid));
        }
        else{
            hig = a;
            base = b;
            System.out.println("\nHeight and Width of Triangle : "+hig+" and "+wid);
            System.out.println("Area      : "+(hig*base*0.5));
        }
    }
    public static void main(String[] args){
        Ex____10 obj1 = new Ex____10(4,"circle");
        Ex____10 obj2 = new Ex____10(15,"square");
        Ex____10 obj3 = new Ex____10(3,7,"rectangle");
        Ex____10 obj4 = new Ex____10(10,15,"tri");

    }

}
