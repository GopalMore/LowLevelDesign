package OOP.Inheritance.MultipleInheritance;
//First way with same name method
//when the both interfaces have a same name of methods so avoide ambiguity we can used default methods in interfaces
interface Dog {
  default   void sound(){
      System.out.println("sound Dog");
  }
 }
 interface Cat{
    default void sound(){
        System.out.println("sound");
    }
 }
 class HybridAnimal implements Dog, Cat {
    @Override
    public void sound(){
        Dog.super.sound();
    }
     public static void main(String[] args) {

        HybridAnimal hybridAnimal = new HybridAnimal();
        hybridAnimal.sound();

     }
 }
