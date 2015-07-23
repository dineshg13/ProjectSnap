package model.drugs;

import model.allergy.SideEffects;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by dineshgurumurthy on 7/20/15.
 */
@Entity
public class Drug {

    @Id
    private long drugId;
    private String drugDescription;



    private Manufacturer manufacturer;



}
