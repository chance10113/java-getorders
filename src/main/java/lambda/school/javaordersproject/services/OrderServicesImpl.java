package lambda.school.javaordersproject.services;


import lambda.school.javaordersproject.models.Order;
import lambda.school.javaordersproject.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service(value = "orderServices")
public class OrderServicesImpl implements OrderServices
{
    @Autowired
    private OrderRepository orderrepos;
    @Transactional
    @Override
    public Order save(Order order)
    {
        return orderrepos.save(order);
    }

}
