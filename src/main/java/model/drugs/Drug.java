package model.drugs;

import model.AbstractBaseModel;
import model.allergy.MedicalAllergy;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by dineshgurumurthy on 7/20/15.
 */
@Entity
public class Drug extends AbstractBaseModel {

    @Id
    private long drugId;
    private String drugDescription;


    @OneToOne(mappedBy = "drug")
    private Composition composition;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "drug_allery", joinColumns = {@JoinColumn(name = "drug_id")}, inverseJoinColumns = {@JoinColumn(name = "allergy_id")})
    private Set<MedicalAllergy> allergies;

    @ManyToMany(mappedBy = "drugs")
    private Set<Manufacturer> manufacturers;


    public long getDrugId() {
        return drugId;
    }

    public void setDrugId(long drugId) {
        this.drugId = drugId;
    }

    public String getDrugDescription() {
        return drugDescription;
    }

    public void setDrugDescription(String drugDescription) {
        this.drugDescription = drugDescription;
    }

    public Composition getComposition() {
        return composition;
    }

    public void setComposition(Composition composition) {
        this.composition = composition;
    }

    public Set<MedicalAllergy> getAllergies() {
        return allergies;
    }

    public void setAllergies(Set<MedicalAllergy> allergies) {
        this.allergies = allergies;
    }

}
