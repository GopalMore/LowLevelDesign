package OOP.Constructor;
//A private constructor is used to restrict object creation from outside the class. It is commonly used in Singleton Design Pattern.
public class PrivateConstructor {

    private static PrivateConstructor instance;
    //private constructor
    private static PrivateConstructor getInstance(){
        if(instance==null){
            instance = new PrivateConstructor();
        }
        return instance;
    }

    public static void main(String[] args) {
        PrivateConstructor s1 = PrivateConstructor.getInstance();
        PrivateConstructor s2 = PrivateConstructor.getInstance();
        System.out.println(s1==s2);// Output: true, as both references point to the same instance
    }
}
