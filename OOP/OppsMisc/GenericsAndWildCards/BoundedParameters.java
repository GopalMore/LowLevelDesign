package OOP.OppsMisc.GenericsAndWildCards;
//A bounded type parameter limits what kinds of types can be passed.
//Use extends (for classes or interfaces).

class Calculator<T extends Number>{
public double add(T num1,T num2){
    return num1.doubleValue()+num2.doubleValue();
}
}
public class BoundedParameters {
    public static void main(String[] args) {
        Calculator<Integer> calculator = new Calculator<>();
        System.out.println("SUM "+calculator.add(10,20));
    }
}
//✅ Only subclasses of Number allowed
//❌ Calculator<String> → compile error
//
//Interview Tip:
//Bounded types let you use type-specific methods safely (doubleValue(), compareTo(), etc.).
