package lambda.school.javaordersproject.services;

import lambda.school.javaordersproject.models.Customer;
import lambda.school.javaordersproject.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<Customer> findAllOrders() {
        List<Customer> list = new ArrayList<>();
        customerrepos.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public Customer findCustomerById(long id) {
        return customerrepos.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Customer " + id + " Not Found!"));
    }

    @Override
    public List<Customer> findByNameLike(String subname) {
        List<Customer> rtnList = customerrepos.findByCustnameContainingIgnoringCase(subname);
        return rtnList;
    }
}
