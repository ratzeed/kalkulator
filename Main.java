import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.println("Kalkulator");

        
        System.out.print("Podaj pierwszą liczbę: ");
        double firstNumber = scanner.nextDouble();

        
        System.out.print("Podaj symbol operacji (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

       
        System.out.print("Podaj drugą liczbę: ");
        double secondNumber = scanner.nextDouble();

       
        double result = 0;
        boolean validOperation = true;

        
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

       
        if (validOperation) {
            System.out.println("Wynik: " + result);
        }

        
        
        scanner.nextLine(); // czyszczenie bufora
        scanner.nextLine(); // oczekiwanie na Enter

        scanner.close();
    }
}
