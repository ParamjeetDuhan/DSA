class checkAplhabets{
    public static void Check(String alpha){
        if((alpha=="a")||(alpha=="e")||(alpha=="i")||(alpha=="o")||(alpha=="u")){
System.out.println("Given alphabet is vowel");
        }
        else{
            System.out.println("Given alphabet is consonant");
        }
    }
}
public class checkAplhabet {
    public static void main(String[] args) {
        checkAplhabets.Check("i");
    }
}
