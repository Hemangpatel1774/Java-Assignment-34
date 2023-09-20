public class ex4 {
    int id;
    String name;

    void setValues(int i, String n) {
        id = i;
        name = n;
    }

    public static void main(String[] args) {
        ex4 s = new ex4();
        s.setValues(1, "John");
        System.out.println("ID: " + s.id + ", Name: " + s.name);
        // Anonymous object
        System.out.println("ID: " + new ex4().id + ", Name: " + new ex4().name);
    }
}
