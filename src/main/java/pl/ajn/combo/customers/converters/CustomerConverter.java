package pl.ajn.combo.customers.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.ajn.combo.customers.dtos.CustomerDTO;
import pl.ajn.combo.customers.entities.Customer;
import pl.ajn.combo.customers.services.DictionaryService;

@Component
public class CustomerConverter implements AbstractConverter<Customer,CustomerDTO> {

    @Autowired
    private DictionaryService dictionaryService;

    @Autowired
    private AddressConverter addressConverter;

    @Override
    public CustomerDTO convertToDto(Customer entity) {
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setName(entity.getName());
        customerDTO.setSurname(entity.getSurname());
        customerDTO.setType(entity.getId());
        customerDTO.setAddresses(addressConverter.convertToDtoList(entity.getAddresses()));
        return customerDTO;
    }

    @Override
    public Customer convertToEntity(CustomerDTO dto) {
        Customer customerEntity = new Customer();
        customerEntity.setName(dto.getName());
        customerEntity.setSurname(dto.getSurname());
        customerEntity.setType(dictionaryService.getDictionaryById(dto.getType()));
        customerEntity.setAddresses(addressConverter.convertToEntityList(dto.getAddresses()));
        return customerEntity;
    }

}
