package pl.ajn.combo.customers.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.ajn.combo.customers.CustomerNotFoundException;
import pl.ajn.combo.customers.converters.CustomerConverter;
import pl.ajn.combo.customers.dtos.CustomerDTO;
import pl.ajn.combo.customers.repositories.CustomerRepository;
import pl.ajn.combo.customers.services.CustomerService;

import java.util.List;

@Service
@Transactional
@EnableJpaRepositories(basePackages = "pl.ajn.combo.customers.repositories")
public class DefaultCustomerService implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private CustomerConverter customerConverter;

	@Override
	public CustomerDTO getCustomerById(Long customerId) {
		return customerConverter.convertToDto(customerRepository.findById(customerId)
				.orElseThrow(() -> new CustomerNotFoundException()));
	}

	@Override
	public List<CustomerDTO> findAll() {
		return customerConverter.convertToDtoList(customerRepository.findAll());
	}

	@Override
	public Long createCustomer(CustomerDTO customerDTO) {
		return customerRepository.saveAndFlush(customerConverter.convertToEntity(customerDTO)).getId();
	}
}
