package model;

import Types.IDType;

import javax.persistence.*;

/**
 * Created by dineshgurumurthy on 7/20/15.
 */

@Entity
public class PersonIdentity extends AbstractBaseModel {

    @Id
    private long identityId;

    @Enumerated(EnumType.STRING)
    private IDType idType;
    private String values;

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

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }
}
