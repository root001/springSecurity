package com.adebayoao.test.customerservice.api;

import com.adebayoao.test.customerservice.data.CustomerData;
import com.adebayoao.test.customerservice.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
    private CustomerRepository customerRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<CustomerData> findAll() {
        List<CustomerData> customerList = new ArrayList<>();
        customerRepository.findAll().forEach(customerList::add);
        return customerList;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Optional<CustomerData> findCustomer(String id) {
        return customerRepository.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createCustomer(@RequestBody CustomerData customer) {
        customerRepository.save(customer);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void editCustomer(@RequestBody CustomerData customer) {
        customerRepository.save(customer);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public CustomerData deleteCustomer(String id) {
        if(customerRepository.existsById(id)) {
            customerRepository.deleteById(id);
        }
        return null;
    }
}
