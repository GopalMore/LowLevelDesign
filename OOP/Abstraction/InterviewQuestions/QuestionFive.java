package OOP.Abstraction.InterviewQuestions;
/* 5. When should you not use an interface? Provide a practical example.
✨Answer: Avoid interfaces when the implementing classes share common functionality or state. For example, if Dog and Cat both need an eat() method with shared logic, an abstract class like Animal is more appropriate than an interface.*/

abstract class CommonFeatureInAnimal{
     void eatings(){
        System.out.println("Eating.....");
    }
}
class Dogs extends CommonFeatureInAnimal{
    void sound(){
        System.out.println("Barking");
    }
}
class Cats extends CommonFeatureInAnimal{
    void sound(){
        System.out.println("Meowww");
    }
}
public class QuestionFive {
    public static void main(String[] args) {
        Dogs dogs = new Dogs();
        dogs.sound();
        dogs.eatings();
        Cats cats = new Cats();
        cats.sound();
        cats.eatings();
    }
}
