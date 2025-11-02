package OOP.OppsMisc.GenericsAndWildCards;

public class GenericMethod {
    static <T> void genericsMethod(T elements){
        System.out.println(elements);
    }
 static  <T> void printArray(T[] array){
        for (T item:array){
            System.out.println(item+" printing elements");
        }
 }
    public static void main(String[] args) {
        genericsMethod("20");
        genericsMethod(10);
        printArray(new Integer[]{1,2,3,4,5});
    }
}
