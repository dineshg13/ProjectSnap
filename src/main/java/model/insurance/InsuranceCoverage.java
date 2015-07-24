package model.insurance;

import model.AbstractBaseModel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Created by dineshgurumurthy on 7/22/15.
 */
@Entity
public class InsuranceCoverage extends AbstractBaseModel {

    @Id
    private long coverageId;

    private String description;

    @OneToOne
    private InsurancePlan insurancePlan;


    public long getCoverageId() {
        return coverageId;
    }

    public void setCoverageId(long coverageId) {
        this.coverageId = coverageId;
    }
}
