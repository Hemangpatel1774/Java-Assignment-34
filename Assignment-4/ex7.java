public class ex7 {
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
        ex7 obj1 = new ex7();
        ex7 obj2 = new ex7();
        ex7 obj3 = new ex7();
        obj1.insert(101 , "Ramesh");
        obj2.insert(102 , "Mahesh");
        obj3.insert(103 , "Suresh");
        obj1.display();
        obj2.display();
        obj3.display();
    }

}
