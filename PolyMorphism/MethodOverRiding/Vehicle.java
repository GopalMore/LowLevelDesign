package PolyMorphism.MethodOverRiding;
/*
 2. Runtime (Dynamic) Polymorphism :
Runtime polymorphism occurs when the method to be executed is determined during runtime. It is achieved through method overriding and is closely tied to inheritance.
Method Overriding :
Method overriding allows a subclass to provide a specific implementation for a method already defined in its parent class. The overridden method in the subclass has the same name, return type, and parameters as the method in the parent class. */
 class Vehicle {
    void start(){
        System.out.println("starting vehicle");
    }
}
class Car extends Vehicle {
@Override
   void start(){
    System.out.println("starting Car");
}
}
class Bike extends Car{
     @Override
     void start(){
         System.out.println("starting Bike");
     }

    public static void main(String[] args) {
    Vehicle vehicle;
    // Assign a Car object to the Vehicle reference
    vehicle  = new Car();
    vehicle.start();
    vehicle = new Bike();
    vehicle.start();
    }
}
/*
Key Features:
• Method resolution happens at runtime based on the actual object type.
• Supports dynamic method dispatch, enabling the Java Virtual Machine (JVM) to determine the appropriate method implementation.

1. Code Reusability:
○ Encourages writing generic and reusable code by allowing a single interface to handle multiple types.
2. Flexibility:
○ Provides flexibility in program design by enabling dynamic method behavior.
3. Extensibility:
Allows easy extension of code by adding new classes / methods or overriding existing ones.

Disadvantages of Polymorphism:
1. Complex Debugging:
Runtime polymorphism can make debugging difficult due to dynamic method resolution.

2. Performance Overhead:
Dynamic method dispatch introduces slight overhead as the JVM resolves the method during runtime.


Conclusion :
Polymorphism is a powerful feature in OOPs that promotes flexibility, modularity, and reusability. Understanding its types—compile-time and runtime—is essential for mastering OOP principles and designing robust applications. 💡
By leveraging polymorphism effectively, developers can write cleaner, more maintainable code, ensuring their applications are scalable and adaptable to change. 🔄💻
 */
