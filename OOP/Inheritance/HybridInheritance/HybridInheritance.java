package OOP.Inheritance.HybridInheritance;
class Animal {
    void eating() {
        System.out.println("Eating");
    }
}

interface Dog {
    void barking();
}

interface cat {
    void meow();
}

public class HybridInheritance extends Animal implements Dog, cat {
    @Override
    public void barking() {
        System.out.println("bariking");
    }

    @Override
    public void meow() {
        System.out.println("meow");
    }

    public static void main(String[] args) {
        HybridInheritance hybridInheritance = new HybridInheritance();
        hybridInheritance.barking();
        hybridInheritance.meow();
        hybridInheritance.eating();
    }
}

