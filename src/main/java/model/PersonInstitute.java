package model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by dineshgurumurthy on 7/21/15.
 */
@Entity
public class PersonInstitute extends AbstractBaseModel {

    @Id
    private long instituteId;
}
