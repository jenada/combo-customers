package pl.ajn.combo.customers.services;

import pl.ajn.combo.customers.dtos.CustomerDTO;

import java.util.List;

public interface CustomerService {
	
	CustomerDTO getCustomerById(Long customerId);

	List<CustomerDTO> findAll();

	Long createCustomer(CustomerDTO customerDTO);
}
