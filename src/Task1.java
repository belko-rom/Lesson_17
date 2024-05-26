import java.time.LocalDate;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свою дату рождения в формате гггг-мм-дд: ");
        LocalDate date = LocalDate.parse(scanner.next());
        LocalDate hundredthBirthday = date.plusYears(100);
        System.out.println("Ваш 100-летний юбилей будет в " + hundredthBirthday);
    }
}