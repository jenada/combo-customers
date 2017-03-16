package pl.ajn.combo.customers.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "CUSTOMERS_CUSTOMER")
public class Customer extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 5490318034418863656L;

    @NotNull
    @Column(name = "NAME")
    private String name;

    @NotNull
    @Column(name = "SURNAME")
    private String surname;

    @ManyToMany(cascade=CascadeType.PERSIST)
    @JoinTable(name="CUSTOMERS_ADDRESS",
            joinColumns={@JoinColumn(name="CUSTOMER_ID", referencedColumnName="ID")},
            inverseJoinColumns={@JoinColumn(name="LOCATION_ID", referencedColumnName="ID")})
    private List<Address> addresses;

    @ManyToOne(optional = false, cascade=CascadeType.ALL)
    @JoinColumn(name = "TYPE_ID", referencedColumnName = "ID")
    private Dictionary type;

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

    public Dictionary getType() {
        return type;
    }

    public void setType(Dictionary type) {
        this.type = type;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

}
