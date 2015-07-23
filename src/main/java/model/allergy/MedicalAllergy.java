package model.allergy;

import Types.AllergyCategory;
import Types.Serverity;

import javax.persistence.Id;

/**
 * Created by dineshgurumurthy on 7/21/15.
 */

public class MedicalAllergy {

    @Id
    private long allergyId;
    private String name;
    private String reactionTo;
    private AllergyCategory allergyCategory;

    private Serverity serverity;


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
