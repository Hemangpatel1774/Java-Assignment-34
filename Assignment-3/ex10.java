public class ex10{
    public static void main(String[]args) {
        int [][]mat1 = {{1,2,3},{4,5,6},{7,8,9}};
        int [][]mat2 = {{10,20,30},{40,50,60},{70,80,90}};
        int [][]mat_sum = new int[3][3];
        for(int i=0; i<3 ; i++){
            for(int j=0 ; j<3 ;j++){
                mat_sum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("------ Sum of Matrices ------");
        for(int i=0; i<3 ; i++){
            for(int j=0 ; j<3 ;j++){
                System.out.print(" "+mat_sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
