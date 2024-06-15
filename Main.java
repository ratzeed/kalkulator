import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Informacja o przeznaczeniu programu
        System.out.println("Kalkulator");

        // Wczytywanie pierwszej liczby
        System.out.print("Podaj pierwszą liczbę: ");
        double firstNumber = scanner.nextDouble();

        // Wczytywanie symbolu operacji
        System.out.print("Podaj symbol operacji (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        // Wczytywanie drugiej liczby
        System.out.print("Podaj drugą liczbę: ");
        double secondNumber = scanner.nextDouble();

        // Zmienna na wynik
        double result = 0;
        boolean validOperation = true;

        // Sprawdzanie symbolu operacji i wykonywanie odpowiedniej operacji
        if (operation == '+') {
            result = firstNumber + secondNumber;
        } else if (operation == '-') {
            result = firstNumber - secondNumber;
        } else if (operation == '*') {
            result = firstNumber * secondNumber;
        } else if (operation == '/') {
            if (secondNumber != 0) {
                result = firstNumber / secondNumber;
            } else {
                System.out.println("Błąd: Nie można dzielić przez zero.");
                validOperation = false;
            }
        } else {
            System.out.println("Błąd: Nieznany symbol operacji.");
            validOperation = false;
        }

        // Wyświetlanie wyniku lub informacji o błędzie
        if (validOperation) {
            System.out.println("Wynik: " + result);
        }

        // Zakończenie działania programu
        System.out.println("Naciśnij Enter, aby zakończyć...");
        scanner.nextLine(); // czyszczenie bufora
        scanner.nextLine(); // oczekiwanie na Enter

        scanner.close();
    }
}
