package model.user;

import Types.OperationType;
import model.AbstractBaseModel;

import javax.persistence.*;

/**
 * Created by dineshgurumurthy on 7/22/15.
 */
@Entity
public class PermittedOperation extends AbstractBaseModel {

    @Id
    private long operationId;

    @Enumerated(EnumType.STRING)
    private OperationType operationType;

    @ManyToOne
    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public long getOperationId() {
        return operationId;
    }

    public void setOperationId(long operationId) {
        this.operationId = operationId;
    }

    public OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }
}
