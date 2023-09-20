public class Ex____4 {
    int id;
    String name;

    void setValues(int i, String n) {
        id = i;
        name = n;
    }

    public static void main(String[] args) {
        Ex____4 s = new Ex____4();
        s.setValues(1, "John");
        System.out.println("ID: " + s.id + ", Name: " + s.name);
        // Anonymous object
        System.out.println("ID: " + new Ex____4().id + ", Name: " + new Ex____4().name);
    }
}
