package concretes;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

    private CustomerCheckService checkService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.checkService = customerCheckService;
    }

    @Override
    public void save(Customer customer) {
        if (checkService.checkIfRealPerson(customer)) {
            super.save(customer);
        }
        else System.out.println("no valid person");
    }
}
