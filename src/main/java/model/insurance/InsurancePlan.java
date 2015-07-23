package model.insurance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by dineshgurumurthy on 7/21/15.
 */
@Entity
public class InsurancePlan {

    @Id
    private long planId;
    private InsuranceProvider provider;
    private String description;
    private String coverageDetails;
}
