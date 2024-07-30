package WEEK1_DesignPattern.Adapter;

public class StripeGateway {
    public void charge(double amount) {
        System.out.println("Charging $" + amount + " through Stripe.");
    }
}
