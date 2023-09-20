public class ex8 {

    public static void main(String[] args){
        int []num = {10,20,30,40,50};
            int []copy_arr = new int[num.length];
        for(int i=0;i<num.length;i++){
            copy_arr[i] = num[i];
        }
        System.out.print("Copied Array : {");
        for (int i:copy_arr) {
            System.out.print(" "+i+" ");
        }
        System.out.println("}");
    }

}


