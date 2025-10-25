package OOP.OppsMisc.ObjectClonning;

class student implements Cloneable{
    int rollNo ;
    String Name;
    student(int rollNo,String Name){
        this.rollNo = rollNo;
        this.Name = Name;
    }
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
}

public class ObjectClonning {
    public static void main(String[] args) {
        try {
            student student1 = new student(101,"Gopal");
            student student2 = (student) student1.clone();
            System.out.println(student1.rollNo + " " + student1.Name);
            System.out.println(student2.rollNo + " " + student2.Name);
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
