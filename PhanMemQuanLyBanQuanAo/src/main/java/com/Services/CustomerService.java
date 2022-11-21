
package com.Services;

import com.Models.Customer;
import java.util.List;


public interface CustomerService {
    public List<Customer> getList();

    public boolean insert(Customer customer);
    public boolean update(Customer customer, String code);
    public boolean delete(String code);
}