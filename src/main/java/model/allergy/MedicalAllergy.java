package model.allergy;

import Types.AllergyCategory;
import Types.Serverity;
import model.Person;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by dineshgurumurthy on 7/21/15.
 */

@Entity
public class MedicalAllergy {

    @Id
    private long allergyId;
    private String name;
    private String reactionTo;

    @Enumerated(EnumType.STRING)
    private AllergyCategory allergyCategory;

    private Serverity serverity;

    private Date startDate;
    private Date endDate;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;


    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public long getAllergyId() {
        return allergyId;
    }

    public void setAllergyId(long allergyId) {
        this.allergyId = allergyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReactionTo() {
        return reactionTo;
    }

    public void setReactionTo(String reactionTo) {
        this.reactionTo = reactionTo;
    }

    public AllergyCategory getAllergyCategory() {
        return allergyCategory;
    }

    public void setAllergyCategory(AllergyCategory allergyCategory) {
        this.allergyCategory = allergyCategory;
    }

    public Serverity getServerity() {
        return serverity;
    }

    public void setServerity(Serverity serverity) {
        this.serverity = serverity;
    }
}
