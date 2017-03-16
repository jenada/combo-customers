package pl.ajn.combo.customers.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.ajn.combo.customers.dtos.AddressDTO;
import pl.ajn.combo.customers.entities.Address;

@Component
public class AddressConverter implements AbstractConverter<Address,AddressDTO> {

    @Autowired
    LocationConverter locationConverter;

    @Autowired
    DictionaryConverter dictionaryConverter;

    @Override
    public AddressDTO convertToDto(Address entity) {
        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setType(entity.getId());
        addressDTO.setLocation(locationConverter.convertToDto(entity.getLocation()));
        return addressDTO;
    }

    @Override
    public Address convertToEntity(AddressDTO dto) {
        Address addressEntity = new Address();
        addressEntity.setType(dictionaryConverter.convertIdToEntity(dto.getType()));
        addressEntity.setLocation(locationConverter.convertToEntity(dto.getLocation()));
        return addressEntity;
    }
}
