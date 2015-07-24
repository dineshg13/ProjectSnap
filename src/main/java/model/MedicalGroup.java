package model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by dineshgurumurthy on 7/20/15.
 */
@Entity
public class MedicalGroup extends AbstractBaseModel {

    @Id
    private long medicalGroupId;

    private String description;

    public long getMedicalGroupId() {
        return medicalGroupId;
    }

    public void setMedicalGroupId(long medicalGroupId) {
        this.medicalGroupId = medicalGroupId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
