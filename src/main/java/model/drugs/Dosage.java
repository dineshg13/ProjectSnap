package model.drugs;

import model.AbstractBaseModel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created by dineshgurumurthy on 7/22/15.
 */
@Entity
public class Dosage extends AbstractBaseModel {

    @Id
    private long dosageId;
    private String dosageDescription;

    @ManyToOne
    @JoinColumn(name = "drug_id")
    private Drug drug;

    public long getDosageId() {
        return dosageId;
    }

    public void setDosageId(long dosageId) {
        this.dosageId = dosageId;
    }

    public String getDosageDescription() {
        return dosageDescription;
    }

    public void setDosageDescription(String dosageDescription) {
        this.dosageDescription = dosageDescription;
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }
}
