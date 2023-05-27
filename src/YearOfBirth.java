import java.time.LocalDate;
import java.util.Scanner;

public class YearOfBirth {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
        System.out.println("Ile masz lat?");

        int age = Integer.parseInt(scanner.nextLine());

        int YearOfBirth = LocalDate.now().getYear() - age;

        System.out.println("Urodziłeś się w " + YearOfBirth + " roku!");

}}
