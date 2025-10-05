package OOP.Inheritance.MultilevelInheritance;

public class AnimalMultiLevel {
    public void eat(){
        System.out.println("eating");
    }
}
 class DogAnimal extends AnimalMultiLevel{
    public void Bariking(){
        System.out.println("Barking");
    }
}
class Mammal extends DogAnimal{
void walking(){
    System.out.println(" walking ");
}
}
 class MainClass{
    public static void main(String[] args) {
Mammal mammal = new Mammal();
mammal.walking();
mammal.eat();
mammal.Bariking();
    }
}
