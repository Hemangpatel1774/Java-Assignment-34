public class Ex_23 {
    public static void main(String[] args){
        int[]  arr_int = {122000,35000,56023,40596,52344,545643,4353433,3453434,3453434,343210};
        float[]  arr_float = {1.5f,2.5f,3.4f,5.8f,5.9f};
        double[] arr_double = {132.532534,23425255.234315,4253453.23425,4524.54323,324.467658};
        short[] arr_short = {-12342,25800,-2834,23333};
        byte[] arr_byte = {23,43,5,6};
        System.out.println("\n--------Print Arrays Using For-each Loop--------");
        System.out.println("\n------Int Array------");
        System.out.print("Int_Array : {");
        for ( int i: arr_int){
            System.out.print(i+",");
        }
        System.out.println("}");
        System.out.println("\n------Int Float------");
        System.out.print("Float_Array : {");
        for(float i: arr_float){
            System.out.print(i+",");
        }
        System.out.println("}");
        System.out.println("\n------Double Array------");
        System.out.print("Double_Array : {");
        for(double i: arr_double){
            System.out.print(i+",");
        }
        System.out.println("}");
        System.out.println("\n------Short Array------");
        System.out.print("Short_Array : {");
        for(short i: arr_short){
            System.out.print(i+",");
        }
        System.out.println("}");
        System.out.println("\n------Byte Array------");
        System.out.print("Byte_Array : {");
        for(byte i: arr_byte){
            System.out.print(i+",");
        }
        System.out.println("}");

    }
}