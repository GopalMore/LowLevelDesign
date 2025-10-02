package Inheritance.SingleLevel;
//single Level inheritance
 class Animal {
    public void walk(){
        System.out.println("walking");
    }
}
class Dog extends Animal{
public void bark(){
    System.out.println("barking");
}
}

class Main{
    public static void main(String[]args){
        Dog dog = new Dog();
        dog.bark();
        dog.walk();
    }
}
