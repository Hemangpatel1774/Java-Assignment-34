public class ex5 {
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
        ex5 s1 = new ex5();
        ex5 s2 = new ex5();
        s1.insertRecord(111, "Karan");
        s2.insertRecord(222, "Aryan");
        s1.displayInformation();
        s2.displayInformation();
    }
}
