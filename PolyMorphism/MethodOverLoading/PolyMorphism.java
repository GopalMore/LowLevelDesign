package PolyMorphism.MethodOverLoading;
/* 1. Compile-time (Static) Polymorphism:
Compile-time or Static polymorphism occurs when the method to be executed is determined at compile time. It is achieved using method overloading or operator overloading. 🛠️

 Method Overloading:
When there are multiple functions with the same name but different parameters, then the functions are said to be overloaded, hence this is known as Function or Method Overloading. Functions can be overloaded by changing the number of arguments or/and changing the type of arguments. 🔢🎚️

 */
//1. Changing the number of arguments :
public class PolyMorphism {
    public void start(int VehicleId){
        System.out.println(VehicleId);
    }
    public void start(int VehicleRegisterNo,String VehicleName){
        System.out.println(VehicleName);
    }
    public static void main(String[] args) {
    PolyMorphism polyMorphism = new PolyMorphism();
    polyMorphism.start(5000);
    polyMorphism.start(1000,"Toyota");
    }
}
