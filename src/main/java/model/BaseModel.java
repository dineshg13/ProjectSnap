package model;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.sql.Date;

/**
 * Created by dineshgurumurthy on 7/22/15.
 */
public abstract class BaseModel {
    private Date created;
    private Date updated;

    @PrePersist
    public void onCreate() {
        created = new Date(System.currentTimeMillis());
    }

    @PreUpdate
    public void onUpdate() {
        updated = new Date(System.currentTimeMillis());
    }

}
