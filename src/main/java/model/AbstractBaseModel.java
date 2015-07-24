package model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by dineshgurumurthy on 7/22/15.
 */
@MappedSuperclass
public abstract class AbstractBaseModel {

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created", nullable = false)
    private java.util.Date created;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated", nullable = false)
    private java.util.Date updated;

    @PrePersist
    protected void onCreate() {
        updated = created = new java.util.Date(System.currentTimeMillis());
    }

    @PreUpdate
    protected void onUpdate() {
        updated = new java.util.Date(System.currentTimeMillis());
    }

}
