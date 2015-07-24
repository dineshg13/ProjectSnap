package model;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by dineshgurumurthy on 7/20/15.
 */
@Table(name="Prescription")
public class Prescription extends AbstractBaseModel {
    @Id
    private long prescriptionId;
    private String description;
}
