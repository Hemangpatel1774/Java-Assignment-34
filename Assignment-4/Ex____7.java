public class Ex____7 {
    String name ;
    int id ;
    int salary = 20000;
    void insert(int i , String n){
        id = i;
        name = n;
    }
    void display(){
        System.out.println("Name  : "+name+"\nID    : "+id+"\nSalary : "+salary+"\n");
    }
    public static void main(String[] args){
        Ex____7 obj1 = new Ex____7();
        Ex____7 obj2 = new Ex____7();
        Ex____7 obj3 = new Ex____7();
        obj1.insert(101 , "Ramesh");
        obj2.insert(102 , "Mahesh");
        obj3.insert(103 , "Suresh");
        obj1.display();
        obj2.display();
        obj3.display();
    }

}
