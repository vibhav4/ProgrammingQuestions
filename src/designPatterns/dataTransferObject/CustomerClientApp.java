//package designPatterns.dataTransferObject;
//
////import com.sun.istack.internal.logging.Logger;
//
////import jdk.nashorn.internal.runtime.logging.Logger;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.logging.Logger;
//
//public class CustomerClientApp {
//
////    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerClientApp.class);
////    private static final Logger l1 = lo
//    /**
//     * Method as act client and request to server for details.
//     *
//     * @param args program argument.
//     */
//    public static void main(String[] args) {
//        List< CustomerDto > customers = new ArrayList< >();
//        CustomerDto customerOne = new CustomerDto("1", "Kelly", "Brown");
//        CustomerDto customerTwo = new CustomerDto("2", "Alfonso", "Bass");
//        customers.add(customerOne);
//        customers.add(customerTwo);
//
//        CustomerResource customerResource = new CustomerResource(customers);
//
//        LOGGER.info("All customers:-");
//        List < CustomerDto > allCustomers = customerResource.getAllCustomers();
//        printCustomerDetails(allCustomers);
//
//        LOGGER.info("----------------------------------------------------------");
//
//        LOGGER.info("Deleting customer with id {1}");
//        customerResource.delete(customerOne.getId());
//        allCustomers = customerResource.getAllCustomers();
//        printCustomerDetails(allCustomers);
//
//        LOGGER.info("----------------------------------------------------------");
//
//        LOGGER.info("Adding customer three}");
//        CustomerDto customerThree = new CustomerDto("3", "Lynda", "Blair");
//        customerResource.save(customerThree);
//        allCustomers = customerResource.getAllCustomers();
//        printCustomerDetails(allCustomers);
//    }
//
//    private static void printCustomerDetails(List < CustomerDto > allCustomers) {
//        allCustomers.forEach(customer -> LOGGER.info(customer.getFirstName()));
//    }
//}
