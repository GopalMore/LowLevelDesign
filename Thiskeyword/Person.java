package Thiskeyword;

public class Person {
    public int age;
    public String name;
    Person(int age,String name){
        this.age=age;
        this.name=name;
    }

    public void personDetails(){
        System.out.println("age "+age+" name "+name);
    }
    public static void main(String[] args) {
        Person person = new Person(25,"Gopal");

       person.personDetails();
    }
}
