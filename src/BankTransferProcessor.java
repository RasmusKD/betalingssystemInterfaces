public class BankTransferProcessor implements PaymentProcessor{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing " + amount + " via Bank transfer");
    }
}
