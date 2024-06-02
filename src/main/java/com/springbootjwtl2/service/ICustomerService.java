package com.springbootjwtl2.service;
import com.springbootjwtl2.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    Customer findOne(Long id);

    void save(Customer customer);

    void deleteById(Long id);
}
