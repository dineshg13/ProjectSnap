package model.insurance;

import model.AbstractBaseModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

/**
 * Created by dineshgurumurthy on 7/21/15.
 */
@Entity
public class InsuranceProvider extends AbstractBaseModel {

    @Id
    @Column(name = "insurance_id")
    private long insuranceId;
    private String name;
    private String description;

    @OneToMany(mappedBy = "insuranceProvider")
    private Set<InsurancePlan> plans;

    public long getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(long insuranceId) {
        this.insuranceId = insuranceId;
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

    public Set<InsurancePlan> getPlans() {
        return plans;
    }

    public void setPlans(Set<InsurancePlan> plans) {
        this.plans = plans;
    }
}
