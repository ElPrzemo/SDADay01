public class WorkingWithString {
    public static void main(String[] args) {
        String city = "Nowy Jork";
        int length = city.length();

        System.out.println(length);


        //co to znaczy że string jest niemutowalny

        String result = city.toUpperCase();
        System.out.println(result);
        System.out.println(city);

        result = city.toLowerCase();
        System.out.println(result);

                //!! pojedyńczy cudzysłów
        // na jakiej pozycji jest dana litera
        int index = city.indexOf('w');   //ostatnia pozycja danej litery;
        System.out.println("Index: " + index);



        //ucina tekst z pomięciem 3 pierwszych znajków
        // albo inaczej bierze tekst od 3 pozycji
        result = city.substring(3);
        System.out.println(result);


        result = city.substring(4,7);
        System.out.println(result);

        result = city.replace('o', 'X');
        System.out.println("replace: " + result);



    }
}
