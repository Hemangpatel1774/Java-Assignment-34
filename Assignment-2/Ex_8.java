import java.util.Scanner;
public class Ex_8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("----Rectangle----");
        System.out.print("Name : ");
        String name = sc.nextLine();
        System.out.print("Age : ");
        int age = sc.nextInt();
        System.out.print("Salary : ");
        String salary = sc.next();
        System.out.print("Sex : ");
        String sex = sc.next();
        System.out.println("------About Employee------");
        System.out.println("Name   : "+name+"\nAge    : "+age+"\nSalary : "+salary+"\nSex    : "+sex);
}
}
