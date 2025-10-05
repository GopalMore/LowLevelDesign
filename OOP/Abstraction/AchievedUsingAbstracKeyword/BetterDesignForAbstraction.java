package OOP.Abstraction.AchievedUsingAbstracKeyword;

interface PetAnimals {
    void Cat();
}

abstract class Birds {
    abstract void flying();
}

interface WildAnimals {
    void Lion();
}

class Animals implements WildAnimals, PetAnimals {
    @Override
    public void Cat() {
        System.out.println("cat is PetAnimal");
    }

    @Override
    public void Lion() {
        System.out.println("Lion is king Of jungle");
    }
}

class Flying extends Birds {
    @Override
    public void flying() {
        System.out.println("Flying");
    }
}

public class BetterDesignForAbstraction {
    public static void main(String[] args) {
        PetAnimals petAnimals = new Animals();
        petAnimals.Cat();
        WildAnimals wildAnimals = new Animals();
        wildAnimals.Lion();
        Birds birds = new Flying();
        birds.flying();
    }
}


