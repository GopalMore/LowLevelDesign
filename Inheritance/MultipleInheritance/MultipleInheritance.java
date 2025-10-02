package Inheritance.MultipleInheritance;

//normal way to achive multiple inheritance
interface personWithDisabilities {
    void withWheelChair();
}

interface NormalPerson {
    void NormallyWalk();
}

 class PersonsWay implements personWithDisabilities, NormalPerson {

    public void withWheelChair() {
        System.out.println("withWheelChair");
    }
    public void NormallyWalk() {
        System.out.println("NormallyWalk");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        PersonsWay persons = new PersonsWay();
        persons.NormallyWalk();
        persons.withWheelChair();
    }

}