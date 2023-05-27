public class StringBasics {
    public static void main(String[] args) {
        //literał
        //to jest tekst zapisany wprost w cudzysłowiu

        //łaczenie napisów = konkatynacja

        String firstName = "Jan";
        String lastName = "Kowalski";
        String result = firstName +" "+ lastName;

        System.out.println(result);

        //inny sposób
        result = firstName.concat(" " + lastName);
        System.out.println(result);
}}
