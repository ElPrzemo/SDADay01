import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość boku A");

        double a = scanner.nextDouble();

        System.out.println("Podaj długośc boku B");

        double b = scanner.nextDouble();

        double circuit = (a*2) + (b*2);
        double field = a * b;

        System.out.println("Obwód prostokąta wynosi: "+ circuit);
        System.out.println("Pole prostokąta wynosi "+ field);

        scanner.close();

    }
}
