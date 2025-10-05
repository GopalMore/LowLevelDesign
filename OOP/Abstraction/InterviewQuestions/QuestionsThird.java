package OOP.Abstraction.InterviewQuestions;

/*
. Why can’t we instantiate an abstract class? What would be the consequences if it were allowed?
✨Answer: Abstract classes are incomplete blueprints meant to be extended. Allowing instantiation would violate the principle of abstraction, as abstract methods lack implementation. */
abstract class Animie{
    abstract void sound();
}
class BullDog extends Animie{
    @Override
    void sound(){
        System.out.println("Dog is barking");
    }
}
public class QuestionsThird {
    public static void main(String[] args) {
//        Animie animie = new Animie();     // Animal animal = new Animal(); // Compile-time error
        Animie dog = new BullDog();
        dog.sound(); //output is Dog is barking
    }
}
