package OOP.Abstraction.InterviewQuestions;
/*  1. What is the difference between an abstract class and an interface in Java? When would you use one over the other?
-> Abstract classes are used when classes share common functionality and state, whereas interfaces are used to define a contract for unrelated classes.
Use abstract classes when you need shared code and interfaces for behavior enforcement.*/

abstract class Animals{
    String name;
    Animals(String name){
        this.name=name;
    }
    abstract void sound();
}
interface pet{
    void Play();
}
class Dog extends Animals implements pet{
    Dog(String name){
        super(name);
    }
    @Override
    public void sound(){
        System.out.println(name+" makes Sound");
    }
    @Override
    public void Play(){
        System.out.println("Playing");
    }
}

public class QuestionsFirst {
    public static void main(String[] args) {
        Animals animals = new Dog("Bull Dog");
        animals.sound();
        Dog dog = new Dog("bull");
        dog.sound();
        dog.Play();
    }
}
