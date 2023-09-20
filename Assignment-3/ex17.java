import java.util.Locale;
public class ex17 {
    public static void main(String[] args){
        String str = "Hello";
        String str2 = "How are    You?";
        System.out.println("1. "+str.charAt(4));
        System.out.println("2. "+str.length());
        System.out.println("3. "+str.substring(1,3));
        System.out.println("4. "+str.contains("el"));
        System.out.println("5. "+str.equals(str2));
        System.out.println("6. "+str2.isEmpty());
        System.out.println("7. "+str.concat(str2));
        System.out.println("8. "+str.replace("lo","LO"));
        System.out.println("9. "+str.indexOf("o"));
        System.out.println("10. "+str.toLowerCase());
        System.out.println("11. "+str2.toLowerCase(Locale.FRANCE));
        System.out.println("12. "+str.toUpperCase());
        System.out.println("13. "+str2.toUpperCase(Locale.JAPAN));
        System.out.println("14. "+str2.trim());
    }
}
