import java.util.Scanner;
import java.util.function.Supplier;

public class Task5 {
    public static void main(String[] args) {
        Supplier<String> inputSupplier = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите строку: ");
            String input = scanner.nextLine();
            StringBuilder stringBuilder = new StringBuilder(input);
            return stringBuilder.reverse().toString();
        };

        System.out.println("Обратная строка: " + inputSupplier.get());
    }
}
