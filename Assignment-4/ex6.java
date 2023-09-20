public class ex6 {
    int id;
    String name;

    ex6(int r , String n){
        this.id = r;
        this.name = n;
    }

    void displayInformation() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        ex6 s1 = new ex6(34,"Hemu");
        s1.displayInformation();
    }
}
