public class Ex____6 {
    int id;
    String name;

    Ex____6(int r , String n){
        this.id = r;
        this.name = n;
    }

    void displayInformation() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        Ex____6 s1 = new Ex____6(34,"Hemu");
        s1.displayInformation();
    }
}
