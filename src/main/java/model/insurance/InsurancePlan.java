package model.insurance;

import model.AbstractBaseModel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by dineshgurumurthy on 7/21/15.
 */
@Entity
public class InsurancePlan extends AbstractBaseModel {

    @Id
    private long insurancePlanId;
    private String description;

    @ManyToOne
    private InsuranceProvider insuranceProvider;

    public InsuranceProvider getInsuranceProvider() {
        return insuranceProvider;
    }

    public void setInsuranceProvider(InsuranceProvider insuranceProvider) {
        this.insuranceProvider = insuranceProvider;
    }

    public long getInsurancePlanId() {
        return insurancePlanId;
    }

    public void setInsurancePlanId(long insurancePlanId) {
        this.insurancePlanId = insurancePlanId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
