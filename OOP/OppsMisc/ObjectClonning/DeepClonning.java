package OOP.OppsMisc.ObjectClonning;

class course {
    String subject;

    course(String subject) {
        this.subject = subject;
    }

    public course deepClone() {
        return new course(this.subject);
    }
}

class students implements Cloneable {
    int id;
    String name;
    course course;

    students(int id, String name, course course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        students cloned = (students) super.clone();
        cloned.course = this.course.deepClone();
        return cloned;
    }
}

public class DeepClonning {
    public static void main(String[] args) throws CloneNotSupportedException {
        course c1 = new course("Math");
        students s1 = new students(101, "Amit", c1);
        students s2 = (students) s1.clone();

        // Change course in original
        s1.course.subject = "Science";

        System.out.println("Original: " + s1.course.subject); // Science
        System.out.println("Cloned  : " + s2.course.subject); // Math (deep cloned)
    }
}
/*| Method                               | Type                           | Pros                                   | Cons                                                            |
| ------------------------------------ | ------------------------------ | -------------------------------------- | --------------------------------------------------------------- |
| **clone()**                          | Shallow (default), can be deep | Fast, supported by Object class        | Complex, error-prone, requires `Cloneable`, no constructor call |
| **Copy Constructor**                 | Deep or Shallow (you choose)   | Full control, uses constructors        | Manual implementation required                                  |
| **Serialization**                    | Deep                           | Easy deep copy of full object graph    | Slower, must implement `Serializable`, not memory efficient     |
| **Factory Method / Builder Pattern** | Deep or Shallow                | Clean design, avoids pitfalls of clone | More verbose to implement                                       |
*/