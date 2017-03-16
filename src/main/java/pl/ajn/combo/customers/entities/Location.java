package pl.ajn.combo.customers.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "CUSTOMERS_LOCATION")
public class Location extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = -7608701146520943909L;

    @NotNull
    @Column(name = "STREET")
    private String street;

    @NotNull
    @Column(name = "NUMBER")
    private String number;

    @Column(name = "APARTMENT")
    private String apartment;

    @NotNull
    @Column(name = "CITY")
    private String city;

    @OneToMany(mappedBy = "location")
    private List<Address> addresses;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
