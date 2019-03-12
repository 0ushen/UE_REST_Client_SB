package entity;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Presence implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer presenceId;
    private String comment;
    private Boolean isPresent;
    private Person personId;
    private Planning planning;

    public Presence() {
    }

    public Presence(Integer presenceId) {
        this.presenceId = presenceId;
    }

    public Integer getPresenceId() {
        return presenceId;
    }

    public void setPresenceId(Integer presenceId) {
        this.presenceId = presenceId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Boolean getIsPresent() {
        return isPresent;
    }

    public void setIsPresent(Boolean isPresent) {
        this.isPresent = isPresent;
    }

    public Person getPersonId() {
        return personId;
    }

    public void setPersonId(Person personId) {
        this.personId = personId;
    }

    public Planning getPlanning() {
        return planning;
    }

    public void setPlanning(Planning planning) {
        this.planning = planning;
    }

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (presenceId != null ? presenceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Presence)) {
            return false;
        }
        Presence other = (Presence) object;
        if ((this.presenceId == null && other.presenceId != null) || (this.presenceId != null && !this.presenceId.equals(other.presenceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Presence[ presenceId=" + presenceId + " ]";
    }
    
}
