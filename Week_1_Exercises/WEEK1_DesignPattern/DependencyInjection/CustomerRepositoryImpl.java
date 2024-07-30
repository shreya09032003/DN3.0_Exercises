package WEEK1_DesignPattern.DependencyInjection;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(int id) {
        // Simulate fetching customer data from a database
        return "Customer with ID: " + id;
    }
}
