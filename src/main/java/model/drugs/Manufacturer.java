package model.drugs;

import model.AbstractBaseModel;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by dineshgurumurthy on 7/20/15.
 */
@Entity
public class Manufacturer extends AbstractBaseModel {

    @Id
    private long manufacturerId;

    private String name;
    private String location;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "manufacturer_drug", joinColumns = {@JoinColumn(name = "manufacturer_id")}, inverseJoinColumns = {@JoinColumn(name = "drug_id")})

    private Set<Drug> drugs;

    public Set<Drug> getDrugs() {
        return drugs;
    }

    public void setDrugs(Set<Drug> drugs) {
        this.drugs = drugs;
    }

    public long getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(long manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
