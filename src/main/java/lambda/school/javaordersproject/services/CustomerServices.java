package lambda.school.javaordersproject.services;

import lambda.school.javaordersproject.models.Customer;

import java.util.List;

public interface CustomerServices {
    Customer save(Customer customer);

    List<Customer> findAllOrders();
    Customer findCustomerById(long id);
    List<Customer> findByNameLike(String subname);
}
