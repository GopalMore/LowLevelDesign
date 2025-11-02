package OOP.OppsMisc.GenericsAndWildCards;
interface Operator<T>{
    T apply(T a,T b);
}
enum getEnums implements Operator<Integer>{
   ADD {
       public Integer apply(Integer data1,Integer data2){
           return data1+data2;
       }
   },
    MULTITPLY {
       public Integer apply(Integer d ,Integer b){
           return d*b;
    }
}

}

public class EnumGenerics {
    public static void main(String[] args) {
        System.out.println("ADD "+ getEnums.ADD.apply(10,20));
        System.out.println("MULTIPLY "+ getEnums.MULTITPLY.apply(20,2));
    }
}
/*
Enums themselves can’t be generic,
but they can implement generic interfaces or define generic methods.

⚡ Example: Enum implementing Generic Interface

✅ Real-world pattern used in functional-style operations.
*/