package lambda.school.javaordersproject.repositories;

import lambda.school.javaordersproject.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}