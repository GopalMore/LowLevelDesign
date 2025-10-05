package OOP.Abstraction.InterviewQuestions;
/*8. Why do we need default methods in Java? Couldn’t we achieve the same with abstract classes?
✨Answer:
         Default methods allow interfaces to add new behavior without forcing all implementing classes to change.
         Abstract classes cannot achieve this because Java does not allow multiple inheritance of classes.
         Interfaces with default methods enable flexibility while avoiding the diamond problem*/
interface Animal{
     default void sound(){
        System.out.println("This is default method");
    }
}
abstract class classMammals{
    abstract void eat();
}
class Rabbit extends classMammals implements Animal{
    @Override
    void eat(){
        System.out.println("Rabbit is eat carrot");
    }
    @Override
    public void sound(){
        System.out.println("Sound Method Executions");
    }
}
public class QuestionEight {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.sound();
    }
}
