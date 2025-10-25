package OOP.OppsMisc.GenericsAndWildCards;

public class GenericMethod {
    static <T> void genericsMethod(T elements){
        System.out.println(elements);
    }

    public static void main(String[] args) {
        genericsMethod("20");
        genericsMethod(10);
    }
}
