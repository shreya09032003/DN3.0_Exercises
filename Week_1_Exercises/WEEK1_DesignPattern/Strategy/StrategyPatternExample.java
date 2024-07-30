package WEEK1_DesignPattern.Strategy;

public class StrategyPatternExample {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9876-5432");
        PaymentStrategy paypal = new PayPalPayment("user@example.com");

        context.setPaymentStrategy(creditCard);
        context.executePayment(150);

        context.setPaymentStrategy(paypal);
        context.executePayment(200);
    }
}
