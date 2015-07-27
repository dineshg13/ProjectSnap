package model;

import Types.MedicalReportType;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

/**
 * Created by dineshgurumurthy on 7/21/15.
 */
@Entity
public class MedicalReport extends AbstractBaseModel {

    @Id
    private long medicalReportId;

    private MedicalReportType reportType;

    private String reportDescription;

    private Date reportDate;


    @ManyToMany
    @JoinTable(name = "medical_institute_interaction", joinColumns = {@JoinColumn(name = "medical_report_id")}, inverseJoinColumns = {@JoinColumn(name = "interaction_id")})
    private Set<MedicalInteraction> medicalInteractions;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;


    @OneToMany(mappedBy = "medicalReport")
    private Set<Prescription> prescriptions;


    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

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
