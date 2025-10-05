package OOP.Constructor;

public class ParameterizedConstructor {
int rollNo;
String Name;

ParameterizedConstructor(int rollNo,String name){
    this.rollNo = rollNo;
    this.Name = name;
}
public void student(){
    System.out.println("role no is "+rollNo+" and student name is "+Name);
}
    public static void main(String[] args) {
        ParameterizedConstructor constructor = new ParameterizedConstructor(10,"Gopal");
constructor.student();
}
}
