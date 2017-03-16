package pl.ajn.combo.customers.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "CUSTOMERS_DICTIONARY")
public class Dictionary extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 4560934363623702188L;

    @NotNull
    @JsonIgnore
    @Column(name = "CATEGORY")
    private String category;

    @NotNull
    @Column(name = "NAME")
    private String name;

    @JsonIgnore
    @Column(name = "DESCRIPTION")
    private String description;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
