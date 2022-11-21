
package com.Services.Implements;

import com.Models.Customer;
import com.Repositories.CustomerRepository;
import com.Services.CustomerService;
import java.util.List;

public class CustomerServiceImplement implements CustomerService{
    
    private CustomerRepository customerRepository = new CustomerRepository();

    @Override
    public List<Customer> getList() {
        return customerRepository.getList();
    }

    @Override
    public boolean insert(Customer customer) {
        return customerRepository.insert(customer);
    }

    @Override
    public boolean update(Customer customer, String code) {
        return customerRepository.update(customer, code);
    }

    @Override
    public boolean delete(String code) {
        return customerRepository.delete(code);
    }
    
}

