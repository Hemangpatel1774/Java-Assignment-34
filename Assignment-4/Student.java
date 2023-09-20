public class Student {
    private int id;
    private String name;
    private static String college_name ;
    Student(int id,String name){
        this.id = id;
        this.name = name;
    }
    static void setCollegeName(String n){
        college_name = n;
    }
    public static void main(String[] args) {
        Student s1 = new Student(101 , "Smit");
        Student s2 = new Student(102 , "Neel");
        Student s3 = new Student(103 , "Aman");
        Student s4 = new Student(104 , "Meet");
        setCollegeName("MSU Baroda");
        System.out.println("----- Student Information -----");
        System.out.println("\n Id   Name  College_name\n");
        System.out.println(s1.id+"   "+s1.name+"   "+college_name);
        System.out.println(s2.id+"   "+s2.name+"   "+college_name);
        System.out.println(s3.id+"   "+s3.name+"   "+college_name);
        System.out.println(s4.id+"   "+s4.name+"   "+college_name);




    }
}
