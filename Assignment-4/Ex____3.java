public class Ex____3 {
    String name;
    int id;
    Ex____3(String n , int i){
        this.name = n;
        this.id = i;
    }
    public void gets(){
        System.out.println("Name : "+this.name);
        System.out.println("Id   : "+this.id);
    }
    public static void main(String[] args){
        Ex____3 obj = new Ex____3("Hemang",34);
        obj.gets();
    }
}
