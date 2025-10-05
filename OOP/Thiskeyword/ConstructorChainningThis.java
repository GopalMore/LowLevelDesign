package OOP.Thiskeyword;

//1. Referring to the Instance Object:
public class ConstructorChainningThis {
    int age;
    String name;

    // Constructor 1
    ConstructorChainningThis(int age) {
        this(age, "gopal"); //call 2 constructor
    }

    ConstructorChainningThis(int age, String names) {
        this.age = age;
        this.name = names;
    }

    public void Methodss() {
        System.out.println(age + name);
    }

    public static void main(String[] args) {
        ConstructorChainningThis constructorChainningThis = new ConstructorChainningThis(25, "Gopal");
        constructorChainningThis.Methodss();
    }
}
