package com.adebayoao.test.customerservice.data;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CustomerData {
    String id;
    String fullName;
    int mobile;
    String email;
    String address;
}
