public class ex19 {
    public static void main(String[] args){
        String s1 = "Krishna";
        String s2 = "Krishna";
        String s3 = new String("Krina");
        String s4 = "Krupali";
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1==s3);
        System.out.println(s1.compareTo(s3));
    }
}
