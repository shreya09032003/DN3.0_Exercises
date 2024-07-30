package WEEK1_DesignPattern.DependencyInjection;

public class DependencyInjectionExample {
    public static void main(String[] args) {
        // Create a repository instance
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Inject the repository into the service
        CustomerService service = new CustomerService(repository);

        // Use the service to get customer details
        String customerDetails = service.getCustomerDetails(1);
        System.out.println(customerDetails);
    }
}
