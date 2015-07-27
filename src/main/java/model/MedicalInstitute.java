package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.Set;

/**
 * Created by dineshgurumurthy on 7/20/15.
 */
@Entity
public class MedicalInstitute extends AbstractBaseModel {

    @Id
    private long medicalInstituteId;

    private String description;

    private String address;

    private String parentOrganisation;

    @ManyToMany(mappedBy = "medicalInstitutes")
    private Set<Person> persons;

    @OneToMany(mappedBy = "person")
    private Set<MedicalReport> medicalReports;


    public String getParentOrganisation() {
        return parentOrganisation;
    }

    public void setParentOrganisation(String parentOrganisation) {
        this.parentOrganisation = parentOrganisation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Person> getPersons() {
        return persons;
    }

    public void setPersons(Set<Person> persons) {
        this.persons = persons;
    }

    public long getMedicalInstituteId() {
        return medicalInstituteId;
    }

    public void setMedicalInstituteId(long medicalInstituteId) {
        this.medicalInstituteId = medicalInstituteId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
