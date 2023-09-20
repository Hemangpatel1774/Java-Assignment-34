public class Ex_30{
    public static void main(String[] args) {
        for(byte i = 1 ; i<=3 ; i++){
            for (byte j = 1 ; j<=3 ; j++){
                if (i==2 & i<=j){
                    continue;
                }
                System.out.print(i+" ");
                System.out.print(j);
                System.out.println();
            }
        }
    }
}
