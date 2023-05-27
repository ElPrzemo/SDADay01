public class Operators {

    public static void main(String[] args) {
        //operator przypisania '='
        int value = 512;
        value = 2048;

        System.out.println("Value: " + value);

        int x;
        x = value;
        System.out.println("x: " + x);

        x = x + 2;
        System.out.println("x: " + x);

        x = 5 + x;
        System.out.println("x: " + x);

        //to samo co x = x + 10
        x += 10;
        System.out.println("x: " + x);

        x = 10 - 2;
        System.out.println("x: " + x);

        x = x - 2;
        System.out.println("x: " + x);

        //x = x - 2;
        x -= 2;
        System.out.println("x: " + x);

        //analogicznie jest dla + - / * %


        //operator inkrementacji
        //inkrementacja = zwiekszanie wartosci
        x = x + 1;
        x += 1;
        //inkrementacja  x = x +1
        x++;

        //operator dekrementacji
        x = x - 1;
        x--;
    }
}