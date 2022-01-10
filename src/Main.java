
import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concretes.CustomerCheckManager;
import concretes.NeroCustomerManager;
import concretes.StarbucksCustomerManager;
import entities.Customer;

public class Main {

    public static void main(String[] args) {
        System.out.println("Coffee Order Project");

        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
//        BaseCustomerManager customerManager = new NeroCustomerManager(new CustomerCheckManager());
        Customer c1 = new Customer(1, "Suat", "TÜRKOĞLU", 1996, "TC_KIMLIK_NO");

        customerManager.save(c1);

    }

}
