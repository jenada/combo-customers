package pl.ajn.combo.customers.dtos;

import javax.validation.constraints.NotNull;
import java.util.List;

public class CustomerDTO {

    @NotNull
    private String name;

    @NotNull
    private String surname;

    @NotNull
    private List<AddressDTO> addresses;

    @NotNull
    private Long type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<AddressDTO> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AddressDTO> addresses) {
        this.addresses = addresses;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }
}
