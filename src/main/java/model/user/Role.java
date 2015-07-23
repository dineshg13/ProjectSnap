package model.user;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by dineshgurumurthy on 7/20/15.
 */
@Entity
public class Role {

    @Id
    private long roleId;

    @OneToMany(mappedBy = "role")
    private Set<PermittedOperation> permittedOperations;

}
