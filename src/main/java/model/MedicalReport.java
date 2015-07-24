package model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by dineshgurumurthy on 7/21/15.
 */
@Entity
public class MedicalReport extends AbstractBaseModel {

    @Id
    private long medicalReportId;

    private String reportDescription;

    public long getMedicalReportId() {
        return medicalReportId;
    }

    public void setMedicalReportId(long medicalReportId) {
        this.medicalReportId = medicalReportId;
    }

    public String getReportDescription() {
        return reportDescription;
    }

    public void setReportDescription(String reportDescription) {
        this.reportDescription = reportDescription;
    }
}
