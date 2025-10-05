package OOP.Abstraction.InterviewQuestions;
/* 4. What are the limitations of using abstract classes over interfaces?
✨ Answer: Abstract classes allow single inheritance only, whereas interfaces can be implemented by multiple classes, offering more flexibility.*/



/* using abstract class or methods

abstract class FishTypes{

    abstract void Pompret();
}
abstract class AnimalTypes{
    abstract void Tiger();
}
class Earth extends FishTypes,AnimalTypes{ // This will cause a compile-time error using abstract
    @Override
    void Pompret(){
        System.out.println("Fish");
    }
    @Override
    void Tiger(){
        System.out.println("Hunter");
    }
}
*/

//using interfaces we solve it
interface SeaLivingThings{
    public void Surmai();
    default void commonMethod() {
        System.out.println("Water is common for both surmai");
    }
}
interface CrocoDiles{
    public void TypesOfCrocodiles();
    default void commonMethod() {
        System.out.println("Water is common for both Crocodiles");
    }
}
class WorldAnimals implements SeaLivingThings,CrocoDiles{
    @Override
   public void Surmai(){
        System.out.println("surmai is healthy to eat");
    }

    @Override
    public void TypesOfCrocodiles() {
        System.out.println("Types of Crocodiles");
    }
    @Override
    public void commonMethod(){
        SeaLivingThings.super.commonMethod();
        CrocoDiles.super.commonMethod();
    }

}
public class QuetionsFour {
    public static void main(String[] args) {
        WorldAnimals animals = new WorldAnimals();
        animals.Surmai(); //output: surmai is healthy to eat
        animals.TypesOfCrocodiles(); //output: TypesOfCrockodiles
        animals.commonMethod(); //common Method Exection for how much time we called the method using superKeyword
    }
}
