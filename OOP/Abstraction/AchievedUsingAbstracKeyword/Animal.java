package OOP.Abstraction.AchievedUsingAbstracKeyword;
/* while abstraction, we need must override  all methods in subclass like if
 in abstrat clas have 2 method sound and flying so extends in dog class dog is not flying so it irrelevant to it to solve this problem we usd interfaces */
 abstract class Animal{
    abstract void sound();
     public void sleeping(){
         System.out.println("sleeping");
     }
}
class Dog extends Animal{
     @Override
    public void sound(){
         System.out.println("Dog is barking");
     }
}
class cat extends Animal{
     @Override
    public void sound(){
         System.out.println("cat is meowing");
     }
     public static void main(String Args[]){
         Animal cat = new cat();
         Animal dog = new Dog();
         cat.sound();
         dog.sound();
     }
}

