package model.user;

import Types.RoleType;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import model.Person;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by dineshgurumurthy on 7/20/15.
 */
@Entity
public class Role {

    @Id
    private long roleId;

    private RoleType roleType;


    @JsonManagedReference
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "role_person", joinColumns = {@JoinColumn(name = "role_id")}, inverseJoinColumns = {@JoinColumn(name = "person_id")})
    private Set<Person> persons;


    @OneToMany(mappedBy = "role")
    private Set<PermittedOperation> permittedOperations;

    @ManyToOne
    private User user;

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public Set<PermittedOperation> getPermittedOperations() {
        return permittedOperations;
    }

    public void setPermittedOperations(Set<PermittedOperation> permittedOperations) {
        this.permittedOperations = permittedOperations;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

    public Set<Person> getPersons() {
        return persons;
    }

    public void setPersons(Set<Person> persons) {
        this.persons = persons;
    }
}
