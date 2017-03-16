package pl.ajn.combo.customers.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.ajn.combo.customers.dtos.CustomerDTO;
import pl.ajn.combo.customers.services.CustomerService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/api", produces = "application/json")
public class CustomerController {

    private static final String CUSTOMER_V1_MAPPING = "/v1/customer/";

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = CUSTOMER_V1_MAPPING + "{customerId}", method = RequestMethod.GET)
    @ResponseBody
    public CustomerDTO getCustomerById(@PathVariable Long customerId) {
        return customerService.getCustomerById(customerId);
    }

    @RequestMapping(value = CUSTOMER_V1_MAPPING, method = RequestMethod.GET)
    @ResponseBody
    public List<CustomerDTO> getAllCustomers() {
        return customerService.findAll();
    }

    @RequestMapping(value = CUSTOMER_V1_MAPPING, method = RequestMethod.POST)
    public ResponseEntity createCustomer(@RequestBody @Valid final CustomerDTO customerDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {

            //TODO walidacja i obsługa błedów
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        if (customerService.createCustomer(customerDTO) > 0) {
            return new ResponseEntity(HttpStatus.CREATED);
        }
        return new ResponseEntity(HttpStatus.OK);
    }
}
