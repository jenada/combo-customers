package pl.ajn.combo.customers.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CUSTOMERS_ADDRESS")
public class Address extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1795452615049900222L;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "TYPE_ID", referencedColumnName = "ID")
    private Dictionary type;

    @ManyToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name="LOCATION_ID", referencedColumnName="ID")
    private Location location;

    @ManyToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name="CUSTOMER_ID", referencedColumnName="ID")
    private Customer customer;

    public Dictionary getType() {
        return type;
    }

    public void setType(Dictionary type) {
        this.type = type;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
