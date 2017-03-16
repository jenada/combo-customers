package pl.ajn.combo.customers.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "CUSTOMERS_CLASSIFICATION")
public class Classification extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 4583672013219834670L;

    @NotNull
    @Column(name = "CODE")
    private String code;

    @Column(name = "DESCRIPTION")
    private String descripion;

    @ManyToOne
    @JoinColumn(name = "PARENT_ID")
    private Classification parent;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY, mappedBy = "parent")
    Set<Classification> children;

    Classification() {

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescripion() {
        return descripion;
    }

    public void setDescripion(String descripion) {
        this.descripion = descripion;
    }

    public Classification getParent() {
        return parent;
    }

    public void setParent(Classification parent) {
        this.parent = parent;
    }

    public Set<Classification> getChildren() {
        return children;
    }

    public void setChildren(Set<Classification> children) {
        this.children = children;
    }

}
