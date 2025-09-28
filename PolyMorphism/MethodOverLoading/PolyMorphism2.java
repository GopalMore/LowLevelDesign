package PolyMorphism.MethodOverLoading;
//2. Changing the type of arguments :
public class PolyMorphism2 {
    void start(int ModelNo){
        System.out.println(ModelNo);
    }
    void start(String Name){
        System.out.println(Name);
    }
    public static void main(String[] args) {
    PolyMorphism2 polyMorphism = new PolyMorphism2();
    polyMorphism.start(12);
    polyMorphism.start("Maruti");
    }
}
/*   Key Features:
• Method resolution happens at compile time.
• Provides better readability and cleaner code by allowing methods with the same name to perform similar actions.  */
