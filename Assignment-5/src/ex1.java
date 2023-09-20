public class ex1 {
    private String str;
    ex1(String str){
        this.str = str;
    }
    public static void main(String[] args){
        ex1 obj1 = new ex1("Hello World!");
        System.out.println(obj1.str);
    }
}
