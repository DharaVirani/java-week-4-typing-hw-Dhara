package homework_week_8;

//Java program to overload constructors
public class Program_25_ConstructorOverloading {

    int id;
    String name;
    int age;

//    Creating two constructors
    Program_25_ConstructorOverloading(int i, String n){
        id = i;
        name = n;
    }
//    creating three args constructor
    Program_25_ConstructorOverloading(int i, String n, int a){
        id = i;
        name = n;
        age = a;
    }

    public void display(){
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {
        Program_25_ConstructorOverloading s1 = new Program_25_ConstructorOverloading(111, "Karan");
        Program_25_ConstructorOverloading s2 = new Program_25_ConstructorOverloading(222, "Aryan", 25);
        s1.display();
        s2.display();
    }
}
