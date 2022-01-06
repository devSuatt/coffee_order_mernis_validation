package adapters;

import abstracts.CustomerCheckService;
import entities.Customer;
import mernisService.ISUKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {

    @Override
    public Boolean checkIfRealPerson(Customer customer) {
        ISUKPSPublicSoap client = new ISUKPSPublicSoap();
        try {
            return client.TCKimlikNoDogrula(Long.valueOf(customer.nationalityId),
                                                        customer.firstName,
                                                        customer.lastName,
                                                        customer.dateOfBirth);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
