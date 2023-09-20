public class ex5 {
    public static void main(String[] args){
    int []num = {10,20,30,40,50};
    int sum = 0;
    for(int i: num){
        sum+= i;
    }
        System.out.println("Average of Numbers is "+sum/ num.length);
    }
}
