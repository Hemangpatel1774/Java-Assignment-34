public class Ex_28{
    public static void main(String[] args) {
        for(byte i = 1 ; i<=10 ; i++){
            if(i==7 || i==8){
                continue;
            }
            System.out.println(i);
        }
    }
}
