package pl.ajn.combo.customers.converters;

import org.springframework.stereotype.Component;
import pl.ajn.combo.customers.dtos.LocationDTO;
import pl.ajn.combo.customers.entities.Location;

@Component
public class LocationConverter implements AbstractConverter<Location, LocationDTO> {

    @Override
    public LocationDTO convertToDto(Location entity) {
        LocationDTO locationDTO = new LocationDTO();
        locationDTO.setCity(entity.getCity());
        locationDTO.setStreet(entity.getStreet());
        locationDTO.setNumber(entity.getNumber());
        locationDTO.setApartment(entity.getApartment());
        return locationDTO;
    }

    @Override
    public Location convertToEntity(LocationDTO dto) {
        Location locationEntity = new Location();
        locationEntity.setCity(dto.getCity());
        locationEntity.setStreet(dto.getStreet());
        locationEntity.setNumber(dto.getNumber());
        locationEntity.setApartment(dto.getApartment());
        return locationEntity;
    }
}
