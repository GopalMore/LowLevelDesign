package Constructor;
public class DefaultConstructor {
    private int rollNo;
    private String name;

    public void student(){
        System.out.println("rollNo is "+rollNo + " and Name is "+name);
    }

    public static void main(String[] args) {
        DefaultConstructor constructor = new DefaultConstructor();
        constructor.student();
    }

//    in Default Constructor its take the default values of data types if not assigned and created a default constructor automatically
}
