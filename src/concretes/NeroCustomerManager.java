package concretes;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import abstracts.CustomerService;
import entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

    private CustomerCheckService checkService;

    public NeroCustomerManager(CustomerCheckService checkService) {
        this.checkService = checkService;
    }

    @Override
    public void save(Customer customer) {
        if (checkService.checkIfRealPerson(customer)) {
            super.save(customer);
        }
        else System.out.println("no valid person");
    }
}
