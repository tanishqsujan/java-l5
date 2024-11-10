class parent{
    int age;
    String name;
    void naming(String name){
        System.out.println("Name: " +name);
    }
}
class child extends parent{
    void Age(int age){
        System.out.println("Age: " +age);
    }
}

public class student{
    public static void main(String[] args){
        child c= new child();
        c.naming("Tanishq");
        c.Age(18);
    }
}