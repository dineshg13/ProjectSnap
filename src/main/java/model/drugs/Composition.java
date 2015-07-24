package model.drugs;

import model.AbstractBaseModel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by dineshgurumurthy on 7/20/15.
 */
@Entity
public class Composition extends AbstractBaseModel {

    @Id
    private long compositionId;

    @ManyToOne
    private Drug drug;

    public long getCompositionId() {
        return compositionId;
    }

    public void setCompositionId(long compositionId) {
        this.compositionId = compositionId;
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }
}
