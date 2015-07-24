package model;


import model.insurance.InsuranceCoverage;
import model.user.Role;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by dineshgurumurthy on 7/20/15.
 */
@Entity
public class Person extends AbstractBaseModel {

    @Id
    private Long personId;

    private String name;
    private Date dateOfBirth;
    private String placeOfBirth;
    private String relation;


    @ManyToMany(mappedBy = "persons")
    private Set<Role> roles;

    @ManyToMany
    @JoinTable(name = "person_insurance_coverage", joinColumns = {@JoinColumn(name = "person_id")}, inverseJoinColumns = {@JoinColumn(name = "coverage_id")})
    private Set<InsuranceCoverage> coverages;

    @OneToMany(mappedBy = "person")
    private Set<PersonIdentity> identities;

    public Set<InsuranceCoverage> getCoverages() {
        return coverages;
    }

    public void setCoverages(Set<InsuranceCoverage> coverages) {
        this.coverages = coverages;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
