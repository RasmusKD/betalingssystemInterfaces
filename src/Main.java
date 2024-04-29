import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount to pay:");
        double amount = scanner.nextDouble();
        System.out.println("Choose payment method (1: Credit card, 2: PayPal, 3: Bank Transfer):");
        int choice = scanner.nextInt();
        PaymentProcessor processor;

        switch (choice) {
            case 1 -> processor = new CreditCardProcessor();
            case 2 -> processor = new PayPalProcessor();
            case 3 -> processor = new BankTransferProcessor();
            default -> {
                System.out.println("Invalid choice");
                return;
            }
        }
        processor.processPayment(amount);
    }
}
