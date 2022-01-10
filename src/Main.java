<<<<<<< HEAD

=======
import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concretes.StarbucksCustomerManager;
import entities.Customer;
>>>>>>> 3fd212e (mernis service imported to project)

public class Main {

    public static void main(String[] args) {
        System.out.println("Coffee Order Project");
<<<<<<< HEAD
=======
        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        Customer c1 = new Customer(1, "Suat", "TÜRKOĞLU", 1996, "TC_KIMLIK_NO");

        customerManager.save(c1);



>>>>>>> 3fd212e (mernis service imported to project)
    }

}
