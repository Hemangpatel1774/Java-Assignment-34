public class Ex_22 {
    public static void main(String[] args){
        int[]  arr_int = {122000,35000,56023,40596,52344,545643,4353433,3453434,3453434,343210};
        float[]  arr_float = {1.5f,2.5f,3.4f,5.8f,5.9f};
        double[] arr_double = {132.532534,23425255.234315,4253453.23425,4524.54323,324.467658};
        short[] arr_short = {-12342,25800,-2834,23333};
        byte[] arr_byte = {23,43,5,6};
        System.out.println("--------Print Arrays Using For Loop--------");
        System.out.println("\n------Int Array------");
        System.out.print("Int_Array : {");
        for(int i=0 ; i< arr_int.length;i++){
            System.out.print(arr_int[i]+",");
        }
        System.out.println("}");
        System.out.println("\n------Int Float------");
        System.out.print("Float_Array : {");
        for(int i=0 ; i< arr_float.length;i++){
            System.out.print(arr_float[i]+",");
        }        System.out.println("}");
        System.out.println("\n------Double Array------");
        System.out.print("Double_Array : {");
        for(int i=0 ; i< arr_double.length;i++){
            System.out.print(arr_double[i]+",");
        }
        System.out.println("}");
        System.out.println("\n------Short Array------");
        System.out.print("Short_Array : {");
        for(int i=0 ; i< arr_short.length;i++){
            System.out.print(arr_short[i]+",");
        }
        System.out.println("}");
        System.out.println("\n------Byte Array------");
        System.out.print("Byte_Array : {");
        for(int i=0 ; i< arr_byte.length;i++){
            System.out.print(arr_byte[i]+",");
        }
        System.out.println("}");

    }
}