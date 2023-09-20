public class Ex_24 {
    public static void main(String[] args){
        int[]  arr_int = {122000,35000,56023,40596,52344,545643,4353433,3453434,3453434,343210};
        float[]  arr_float = {1.5f,2.5f,3.4f,5.8f,5.9f};
        double[] arr_double = {132.532534,23425255.234315,4253453.23425,4524.54323,324.467658};
        short[] arr_short = {-12342,25800,-2834,23333};
        byte[] arr_byte = {23,43,5,6};
        System.out.println("\n--------Print Arrays Using While Loop--------");
        System.out.println("\n------Int Array------");
        System.out.print("Int_Array : {");
        int a = 0;
        while(a < arr_int.length){
            System.out.print(arr_int[a]+",");
            a++;
        }
        System.out.println("}");
        System.out.println("\n------Int Float------");
        System.out.print("Float_Array : {");
        int b = 0;
        while(b < arr_float.length) {
            System.out.print(arr_float[b] + ",");
            b++;
        }
        System.out.println("}");
        System.out.println("\n------Double Array------");
        System.out.print("Double_Array : {");
        int c = 0;
        while(c < arr_double.length){
            System.out.print(arr_double[c]+",");
            c++;
        }
        System.out.println("}");
        System.out.println("\n------Short Array------");
        System.out.print("Short_Array : {");
        int d = 0;
        while(d < arr_short.length){
            System.out.print(arr_short[d]+",");
            d++;
        }
        System.out.println("}");
        System.out.println("\n------Byte Array------");
        System.out.print("Byte_Array : {");
        int e = 0;
        while(e < arr_byte.length){
            System.out.print(arr_byte[e]+",");
            e++;
        }
        System.out.println("}");

    }
}