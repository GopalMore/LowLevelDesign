package OOP.Constructor;

public class ConstructorOverLoading {
    int age;
    String name;
    String rollNo;

    ConstructorOverLoading(int age,String name){
        this.age=age;
        this.name=name;
    }
    ConstructorOverLoading(int age,String name,String rollNo){
        this.age=age;
        this.name=name;
        this.rollNo=rollNo;
    }
 void Student(){
    System.out.println("age of student is "+age+" and name of student is "+name+" with rollNo "+rollNo);
}
    public static void main(String[] args) {
        ConstructorOverLoading constructorOverLoading = new ConstructorOverLoading(24,"gopal","12");
        constructorOverLoading.Student();
        ConstructorOverLoading constructorOverLoading1 = new ConstructorOverLoading(24,"gopal");
        constructorOverLoading1.Student();
    }
}
