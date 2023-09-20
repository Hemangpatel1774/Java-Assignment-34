public class ex6 {
    ex6(String value){
        System.out.println(value+" Class Constructor");
    }
}
class Sub extends ex6{
    Sub(){
        super("Super");
    }
    public static void main(String[] args){
        Sub obj = new Sub();
    }
}
