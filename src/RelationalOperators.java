public class RelationalOperators {
    public static void main(String[] args) {
        int x = 256;
        int y = 128;

        System.out.println("x = " + x + "| y = " + y);

        //operator porównania   to jest  ==
        // operatór przypisania  to jest =

        System.out.println(x == y);
        boolean result = (x == y);
        System.out.println( "x == y " +  result);


        result = (x != y);
        System.out.println(result);

        result = (x > y);
        System.out.println(result);

        result = (x >= y);
        System.out.println(result);

        result = (x <= y);
        System.out.println(result);


    }
}
