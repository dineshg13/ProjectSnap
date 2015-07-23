package model.allergy;

import Types.AllergyType;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * Created by dineshgurumurthy on 7/21/15.
 */

public class AllergyDescription {

    @Id
    private long allergyId;
    private String name;
    private String reactionTo;


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

}
