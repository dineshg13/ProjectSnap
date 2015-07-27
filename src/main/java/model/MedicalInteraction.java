package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created by dineshgurumurthy on 7/21/15.
 */
@Entity
public class MedicalInteraction extends AbstractBaseModel {

    @Id
    private long interactionId;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;


    @ManyToOne
    @JoinColumn(name = "medicalInstituteId")
    private MedicalInstitute medicalInstitute;



}
