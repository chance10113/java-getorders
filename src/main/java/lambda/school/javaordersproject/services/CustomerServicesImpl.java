package lambda.school.javaordersproject.services;

import lambda.school.javaordersproject.models.Customer;
import lambda.school.javaordersproject.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "customerServices")
public class CustomerServicesImpl implements CustomerServices{

    @Autowired
    private CustomerRepository customerrepos;
    @Transactional
    @Override
    public Customer save(Customer customer)
    {
        return customerrepos.save(customer);
    }
}
