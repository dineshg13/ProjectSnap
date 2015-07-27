package model;

import model.drugs.Dosage;
import model.drugs.Drug;

import javax.persistence.*;

/**
 * Created by dineshgurumurthy on 7/20/15.
 */
@Entity
public class Prescription extends AbstractBaseModel {
    @Id
    private long prescriptionId;

    private String description;

    @OneToOne
    @JoinColumn(name = "drug_id")
    private Drug drug;

    @OneToOne
    @JoinColumn(name = "dosage_id")
    private Dosage dosage;

    @ManyToOne
    @JoinColumn(name = "medical_report_id")
    private MedicalReport medicalReport;


    public long getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(long prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    public Dosage getDosage() {
        return dosage;
    }

    public void setDosage(Dosage dosage) {
        this.dosage = dosage;
    }
}
