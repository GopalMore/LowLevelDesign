package OOP.Abstraction.InterviewQuestions;
/*10. What happens if a class implements an interface with a default method
        and also inherits the same method from a superclass? Which one gets priority?
✨Answer:The method from the superclass takes priority over the default method in the interface.
 The class will inherit the superclasses method unless it explicitly overrides it.
🧠 Explanation:
In Java, when a class:
Extends a superclass, and
Implements an interface that defines a default method with the same signature —
👉 The superclass method always takes precedence over the interface’s default method.
That’s because:
Class > Interface in Java’s method resolution order.
The compiler gives priority to inheritance from classes to preserve consistent class hierarchy behavior.

 */
interface Mobile{
    default void Screens(){
        System.out.println("samsung mobiles have a OLED screens");
    }
}
 class IPad{
    public void Screens(){
         System.out.println("IPad have not a OLED screens");
    }
}
class Gadgets extends IPad implements Mobile {

}
public class QuestionTen {
    public static void main(String[] args) {
        Gadgets gadgets = new Gadgets();
        gadgets.Screens();
    }
}

/*
🧠 Explanation:
In Java, when a class:
Extends a superclass, and
Implements an interface that defines a default method with the same signature —
👉 The superclass method always takes precedence over the interface’s default method.
That’s because:
Class > Interface in Java’s method resolution order.
The compiler gives priority to inheritance from classes to preserve consistent class hierarchy behavior.
 */