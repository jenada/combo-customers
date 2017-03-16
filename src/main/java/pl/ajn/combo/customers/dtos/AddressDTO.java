package pl.ajn.combo.customers.dtos;

public class AddressDTO {

    private Long type;
    private LocationDTO location;

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public LocationDTO getLocation() {
        return location;
    }

    public void setLocation(LocationDTO location) {
        this.location = location;
    }
}
