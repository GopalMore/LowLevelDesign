package OOP.Abstraction.InterviewQuestions;

/* 6. What are default methods in Java interfaces? Why were they introduced?
✨ Answer: Default methods are methods in interfaces that have a body (implementation).
They were introduced in Java 8 to provide backward compatibility. This allows interfaces to evolve by adding new methods without breaking existing implementations of the interface.*/

interface Games{
    default void Cricket(){
        System.out.println("Cricket is Very Popular Game in India");
    }
}
class Cricket implements Games{
    //no need to override the methods
}
public class QuestionSix {
    public static void main(String[] args) {
        Cricket cricket = new Cricket();
        cricket.Cricket();
    }
}
