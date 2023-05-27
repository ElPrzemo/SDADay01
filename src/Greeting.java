import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imie");

        String userName = scanner.nextLine();

        System.out.println(userName);
    }
}
