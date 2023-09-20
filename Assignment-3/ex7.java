public class ex7{
    public static int sum(int []arr){
        int result = 0;
        for(int i: arr){
            result += i;
        }
        return result;
    }
    public static void main(String[] args){
        int []num = {10,20,30,40,50};
        System.out.println(sum(num));
        }

    }

