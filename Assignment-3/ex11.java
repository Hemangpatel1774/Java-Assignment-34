
public class ex11{
    public static void main(String[]args){
        int [][]num = {{5,4},{6,8}};
        int scale = 3;
        for(int[] i:num){
            for(int j: i) {
                System.out.print(j*scale+" ");
            }
            System.out.println();
        }
    }
}