package OOP.Abstraction.InterviewQuestions;
/*9. Can a class implement an interface without overriding its default methods?
✨Answer:Yes, a class can implement an interface without overriding its default methods.
The default implementation will be inherited. However, the class can override the method if it needs custom behavior.*/
interface laptop{
    default void keyBoard(){
        System.out.println("RGB keyBoard");
    }
}
class ElectronicsGadget implements laptop{
//no need to override here the implements itself gives the properties to ElectronicsGadget Class. so we can directly access the laptop interface method to class.
}
public class QuestionNine {
    public static void main(String[] args) {
        ElectronicsGadget electronicsGadget = new ElectronicsGadget();
        electronicsGadget.keyBoard();
    }
}
