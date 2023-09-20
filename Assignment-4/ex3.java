public class ex3 {
    String name;
    int id;
    ex3(String n , int i){
        this.name = n;
        this.id = i;
    }
    public void gets(){
        System.out.println("Name : "+this.name);
        System.out.println("Id   : "+this.id);
    }
    public static void main(String[] args){
        ex3 obj = new ex3("Hemang",34);
        obj.gets();
    }
}
