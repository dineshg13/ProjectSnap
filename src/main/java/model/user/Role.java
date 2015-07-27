package model.user;

import Types.RoleType;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import model.Person;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

/**
 * Created by dineshgurumurthy on 7/20/15.
 */
@Entity
public class Role {

    @Id
    private long roleId;

    private RoleType roleType;

    private Date startDate;
    private Date endDate;

    @JsonManagedReference
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "role_person", joinColumns = {@JoinColumn(name = "role_id")}, inverseJoinColumns = {@JoinColumn(name = "person_id")})
    private Set<Person> persons;

    @OneToMany(mappedBy = "role")
    private Set<PermittedOperation> permittedOperations;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

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
