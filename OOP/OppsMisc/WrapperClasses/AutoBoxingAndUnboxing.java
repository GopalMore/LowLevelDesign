package OOP.OppsMisc.WrapperClasses;

//custom auto and unboxing

class Custom {
    private int i;

    public Custom(int i) {
        this.i = i;
    }

    public int getValue() {
        return i;
    }

    public void setValue(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return Integer.toString(i);
    }
}
public class AutoBoxingAndUnboxing {
    public static void main(String[] args) {
        //Primitive to Wrapper(AutoBoxing)
        //converting into int
        int a = 20;
        Integer b = Integer.valueOf(a); //converting int into explicitly
        Integer c = a; ;//autoboxing, now compiler will write Integer.valueOf(a) internally
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //Wrapper to Primitive(UnBoxing)
        // this Expression depricate since java 9 -> Integer dd = new Integer(3);


        int num = 5;

        // Wrapper class (Boxing)
        Integer obj = num; // Autoboxing

        // Using utility method
        String str = obj.toString(); // Converts Integer to String

        // Unboxing
        int value = obj; // Auto-unboxing
        System.out.println("Primitive: " + value);
        Custom j = new Custom(10);
        System.out.println(j); // Output: 10
    }
}
