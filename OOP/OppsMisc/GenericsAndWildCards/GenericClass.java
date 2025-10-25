package OOP.OppsMisc.GenericsAndWildCards;

 class  GenericClass <T>{
     T obj;
     GenericClass(T obj){
         this.obj = obj;
     }
    public T getObj(){
         return this.obj;
     }

     public static void main(String[] args) {
         GenericClass <Integer> genericClass = new GenericClass<Integer>(20);
         System.out.println(genericClass.getObj());
     }
}

