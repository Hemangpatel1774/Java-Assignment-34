public class ex23 {
    public static void main(String[] args){
        StringBuffer str = new StringBuffer("Hello World");
        System.out.println(str.append("!"));
        System.out.println(str.insert(5," python"));
        System.out.println(str.replace(5,12,""));
        System.out.println(str.delete(0,6));
        System.out.println(str.reverse());
        System.out.println(str.capacity());
        System.out.println(str.charAt(3));
        System.out.println(str.length());
    }
}
