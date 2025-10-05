package OOP.Abstraction;

public class Abstraction {
}

abstract class Animal {
    private String name;
    // Constructor in abstract class
    Animal(String name) {
        this.name = name;
    }
    public abstract void sound();
    public void soundAnimal(){
        System.out.println("Animals Sound");
    }

}