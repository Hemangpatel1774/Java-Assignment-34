
class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
public class Main{
    public static void main(String[] args) {
        Person p1 = new Person("Meet",19,"Baroda,Gujarat");
        Person p2 = new Person("Jeet",18,"Surat,Gujarat");
        System.out.println("------Person-1------");
        System.out.println("Name   : "+p1.getName()+"\nAge    : "+p1.getAge()+"\nAddress: "+p1.getAddress());
        System.out.println("\n------Person-2------");
        System.out.println("Name   : "+p2.getName()+"\nAge    : "+p2.getAge()+"\nAddress: "+p2.getAddress());
        p1.setAddress("Rajasthan,India");
        System.out.println("\n-------- Updated Information of Person-1 --------\n");
        System.out.println("Name   : "+p1.getName()+"\nAge    : "+p1.getAge()+"\nAddress: "+p1.getAddress());
    }
}