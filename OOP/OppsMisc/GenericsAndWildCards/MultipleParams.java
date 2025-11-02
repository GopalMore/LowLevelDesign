package OOP.OppsMisc.GenericsAndWildCards;

 class MultipleParams <K,V>{
    K elemetnsT;
    V elemetnsU;
    MultipleParams(K elemetnsT,V elemetnsU){
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
