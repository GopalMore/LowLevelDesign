package Constructor.ConstructorChainning;
//Assume AnimalClass
    public class Vehicle  {
String type;

// Parameterized constructor
Vehicle(String type){
    this.type=type;
    System.out.println("vehicle type is "+type);
}
}
class Car extends Vehicle{
String brand;

Car(String type,String brand){
    super(type);
    this.brand=brand;
    System.out.println("Car constructor called. Brand: " + brand);
    }
    public class Main {
        public static void main(String[] args) {
            Car car = new Car("Four Wheeler", "Toyota");
        }
    }
}
/*


### 📘   When is this useful?  

    When the superclass performs   important setup    that should run   before    subclass logic.
    In   inheritance hierarchies    like custom exceptions, entity classes, or framework base classes.
    In   Spring Boot  , when extending framework classes (like `RuntimeException`, `JpaRepository`, etc.)

---

### ❗ Common Interview Questions

| Question                                                    | Explanation                                                                                             |
| ----------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| Why must `super()` be the first line?                       | Java needs to initialize the superclass before subclass members.                                        |
| What happens if the superclass has no default constructor?  | You must explicitly call a parameterized `super(...)` constructor.                                      |
| Can `super()` and `this()` be used in the same constructor? | No. Only one constructor call (either `this()` or `super()`) is allowed, and it must be the first line. |

---

Would you like an example of   constructor chaining across multiple levels of inheritance  , or in a   Spring Boot context (e.g., custom exceptions or entities)  ?


  */