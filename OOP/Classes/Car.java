package OOP.Classes;

public class Car {
    //Attributes
    String Model;
    String year;
    String Engine;


    //Constructor
    public Car(String Model, String year, String Engine) {
        this.Engine = Engine;
        this.Model = Model;
        this.year = year;
    }

    //Methods
    public void carSpecifications() {
        System.out.println(Engine + " and " + " Model Dates is " + year + " and Model names is " + Model);
    }

    public static void main(String[] args) {
        //Creating Objects
        Car car = new Car("Honda", "2025", "Normal 2.5 Digel Engine");
        //Using Objects
        car.carSpecifications();
    }
}

