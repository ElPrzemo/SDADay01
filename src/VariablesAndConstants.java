public class VariablesAndConstants {

    // int typ
    // variable -nazwa
    // zawsze tworząc zmienną mamy typ + nazwa


    // int = integer = liczby całkowite, 0,1,2,-5,-6
    static int variable;
    static int anotherVariable;

    static String text = "hej ho";

    //final robi nam ze zmiennej stałą;
    static final int constant= 3745;

    public static void main(String[] args) {
        variable = 123;

        System.out.println("Moja zmienna" + variable);
        System.out.println(text);

        text = "nowy text";

        System.out.println(text);

        System.out.println(constant);


        text ="54312";

        System.out.println("nowy tekst tekst" + text);

        anotherVariable = 978;
        anotherVariable = variable;

        System.out.println("Another variable " + variable);

        anotherVariable = constant;

        System.out.println("constant w another variavle: " + anotherVariable);
    }


}
