public class ex10 {
    int len ;
    int wid ;
    int base ;
    int hig;
    double pi = 3.14;
    int radius;
    ex10(int a,String t){
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
    ex10(int a,int b,String t){
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
        ex10 obj1 = new ex10(4,"circle");
        ex10 obj2 = new ex10(15,"square");
        ex10 obj3 = new ex10(3,7,"rectangle");
        ex10 obj4 = new ex10(10,15,"tri");

    }

}
