public class Ex_28 {
    public static void main(String[] args){
        int[][] arr = {
                {1,2},
                {3,4,5,6,7},
                {8,9,10},
                {10}
        };
        for (int i = 0; i<arr.length ; i++){
            System.out.print("row-"+(i+1)+" : ");
            for (int j = 0 ; j<arr[i].length ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
