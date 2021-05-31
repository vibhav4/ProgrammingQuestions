package designPatterns.dataTransferObject;

import java.util.List;
import java.util.function.Predicate;

public class CustomerResource {

    private List< CustomerDto > customers;
//    private Predicate<? super CustomerDto> customer;

    /**
     * @param customers initialize resource with existing customers. Act as database.
     */
    public CustomerResource(List < CustomerDto > customers) {
        this.customers = customers;
    }

    /**
     * @return : all customers in list.
     */
    public List < CustomerDto > getAllCustomers() {
        return customers;
    }

    /**
     * @param customer save new customer to list.
     */
    public void save(CustomerDto customer) {
        customers.add(customer);
    }

    /**
     * @param customerId delete customer with id {@code customerId}
     */
    public void delete(String customerId) {
        customers.removeIf( customer -> customer.getId().equals(customerId));
    }

}
