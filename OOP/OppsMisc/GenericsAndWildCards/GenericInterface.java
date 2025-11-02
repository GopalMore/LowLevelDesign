package OOP.OppsMisc.GenericsAndWildCards;

interface container<T>{
    void add(T item);
    T get();
}
class stringConainer implements container<String>{
    private String data;
    public void add (String item){
        data = item;
    }
    public String get(){
        return data;
    }
}
class Generics<T> implements container<T>{
    private T data;
    public void add(T item){
        data = item;
    }
    public T get(){
        return data;
    }
}
class IntergerClass implements container<Integer>{
    private int data;
    public void add (Integer value){
        data = value;
    }
    public Integer get(){
        return data;
    }
}
class GenericInterface {
    public static void main(String[] args) {
        //string container
        stringConainer stringConainer = new stringConainer();
        stringConainer.add("gopal");
        System.out.println(stringConainer.get());

        //integer container
        IntergerClass intergerClass = new IntergerClass();
        intergerClass.add(10);
        System.out.println(intergerClass.get());

        //Generics container
        Generics <Integer> genericClass = new Generics<>();
        genericClass.add(10);
        System.out.println(genericClass.get()+" integer");
        Generics <String > genericClassString = new Generics<>();
        genericClassString.add("gopal");
        System.out.println(genericClassString.get()+" string");
    }
}
//✅ Example mirrors Comparable<T> and Comparator<T>.
