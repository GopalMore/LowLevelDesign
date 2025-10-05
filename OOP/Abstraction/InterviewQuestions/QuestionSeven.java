package OOP.Abstraction.InterviewQuestions;

/* What is the difference between abstract methods and default methods in an interface?
✨Answer: Abstract methods have no body and must be implemented by a class that implements the interface.
          Default methods have a body and can be optionally overridden by implementing classes.*/
interface Home{
    abstract void TwoBhkHome(); //without body and must be required to override
    default void OneBhkHome(){
        System.out.println("One Bhk home is good for single family");
    }
}
class TypesHomes implements Home{
    @Override
    public void TwoBhkHome(){
        System.out.println("Two Bhk home is good for Join family");
    }
}
public class QuestionSeven {
    public static void main(String[] args) {
//        Home home = new TypesHomes();
//        home.OneBhkHome();
//        home.TwoBhkHome();

        TypesHomes typesHomes = new TypesHomes();
        typesHomes.TwoBhkHome();
        typesHomes.OneBhkHome();
    }
}
