package model;

import Types.IDType;

import javax.persistence.*;

/**
 * Created by dineshgurumurthy on 7/20/15.
 */

@Entity
public class PersonalIdentity extends AbstractBaseModel {

    @Id
    private long identityId;

    @Enumerated(EnumType.STRING)
    private IDType idType;
    private String value;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    public long getIdentityId() {
        return identityId;
    }

    public void setIdentityId(long identityId) {
        this.identityId = identityId;
    }

    public IDType getIdType() {
        return idType;
    }

    public void setIdType(IDType idType) {
        this.idType = idType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
