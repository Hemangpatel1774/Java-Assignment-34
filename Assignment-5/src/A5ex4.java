package src;

abstract class Employee{
    String name;
    int paymentPerHour;
    Employee(String name , int paymentPerHour){
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }
    abstract int calculateSalary(int workingHours);
}
class Contractor extends Employee{
    Contractor(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
     int calculateSalary(int workingHours){
        int salary = this.paymentPerHour * workingHours;
        return salary;
    }
}
class FullTimeEmployee extends Employee{
    FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }
    @Override
     int calculateSalary(int workingHours){
        int salary = this.paymentPerHour * workingHours;
        return salary;
    }
}
public class A5ex4 {
    public static void main(String[] args) {
        Contractor c1 = new Contractor("John",1000);
        Contractor c2 = new Contractor("Meet",950);
        FullTimeEmployee e1 = new FullTimeEmployee("Neel",500);
        FullTimeEmployee e2 = new FullTimeEmployee("Jeel",520);
        System.out.println("------- Contractor Information -------");
        System.out.println("1. Name   : "+c1.name+"\n   Salary : "+c1.calculateSalary(7));
        System.out.println("\n2. Name   : "+c2.name+"\n   Salary : "+c2.calculateSalary(8));
        System.out.println("\n------- FullTimeEmployee Information -------");
        System.out.println("1. Name   : "+e1.name+"\n   Salary : "+e1.calculateSalary(8));
        System.out.println("\n2. Name   : "+e2.name+"\n   Salary : "+e2.calculateSalary(9));
    }
}
