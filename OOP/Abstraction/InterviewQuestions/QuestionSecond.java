package OOP.Abstraction.InterviewQuestions;

/*
2. Can an abstract class implement an interface? If yes, why would you do it?
✨Answer: Yes, an abstract class can implement an interface to provide partial implementation.
    This is useful when some methods in the interface have common logic that can be shared across subclasses.
*/
interface cat{
    public void sound();
}
abstract class PetAnimals implements cat{
    private String PetAnimalsNames;
    PetAnimals(String PetAnimalsNames){
        this.PetAnimalsNames =PetAnimalsNames;
    }
    @Override
     public void sound(){
        System.out.println(PetAnimalsNames+" Meoww sound");
    }
    abstract void Types();
}

class Animalss extends PetAnimals{
    Animalss(String Names){
        super(Names);
    }
    @Override
    public void Types(){
        System.out.println("Type of Animallss");
    }

}
public class QuestionSecond {
    public static void main(String[] args) {
        PetAnimals petAnimals = new Animalss("Cat Makes");
        petAnimals.sound();
        petAnimals.Types();


    }
}
