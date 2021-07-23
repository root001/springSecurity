package com.adebayoao.test.customerservice.repository;

import com.adebayoao.test.customerservice.data.CustomerData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerData, String> {
}
