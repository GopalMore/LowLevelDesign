package OOP.OppsMisc.GenericsAndWildCards;

 class MultipleParams <T,U>{
    T elemetnsT;
    U elemetnsU;
    MultipleParams(T elemetnsT,U elemetnsU){
        this.elemetnsT = elemetnsT;
        this.elemetnsU = elemetnsU;
    }
    void getObject(){
        System.out.println(elemetnsT);
        System.out.println(elemetnsU);
     }

     public static void main(String[] args) {
         MultipleParams<Integer,String> multipleParams = new MultipleParams<>(10,"STRING");
         System.out.println(multipleParams.elemetnsU);
         System.out.println(multipleParams.elemetnsT);
         multipleParams.getObject();

     }
}
