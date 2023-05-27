import java.time.LocalDate;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {

        System.out.println("W którym roku się urodziłeś? ");
        Scanner scanner = new Scanner(System.in);
        int yearOfBirth = scanner.nextInt();

        int age = LocalDate.now().getYear() - yearOfBirth;

        System.out.println("Masz " + age + "Lat");

        if(age<18){
            System.out.println("Jesteś niepełnoletni");
        }else {
            System.out.println("Jesteś pełnoletni");
        }

    }
}