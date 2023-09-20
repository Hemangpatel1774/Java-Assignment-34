public class Ex____5 {
    int id;
    String name;

    void insertRecord(int r, String n) {
        id = r;
        name = n;
    }

    void displayInformation() {
        System.out.println(id + " " + name);
    }
    public static void main(String args[]) {
        Ex____5 s1 = new Ex____5();
        Ex____5 s2 = new Ex____5();
        s1.insertRecord(111, "Karan");
        s2.insertRecord(222, "Aryan");
        s1.displayInformation();
        s2.displayInformation();
    }
}
