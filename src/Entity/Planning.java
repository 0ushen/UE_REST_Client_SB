package entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;



@XmlRootElement
public class Planning implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer planningId;
    
    private String room;
    
    private Date seanceDate;
    
    private Date startHour;
    
    private OrganizedUe organizedUe;
    
    private Person teacher;
   
    private Collection<Presence> presenceCollection;

    public Planning() {
    }

    public Planning(Integer planningId) {
        this.planningId = planningId;
    }

    public Integer getPlanningId() {
        return planningId;
    }

    public void setPlanningId(Integer planningId) {
        this.planningId = planningId;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Date getSeanceDate() {
        return seanceDate;
    }

    public void setSeanceDate(Date seanceDate) {
        this.seanceDate = seanceDate;
    }

    public Date getStartHour() {
        return startHour;
    }

    public void setStartHour(Date startHour) {
        this.startHour = startHour;
    }

    public OrganizedUe getOrganizedUe() {
        return organizedUe;
    }

    public void setOrganizedUe(OrganizedUe organizedUe) {
        this.organizedUe = organizedUe;
    }

    public Person getTeacher() {
        return teacher;
    }

    public void setTeacher(Person teacher) {
        this.teacher = teacher;
    }

    

    @XmlTransient
    public Collection<Presence> getPresenceCollection() {
        return presenceCollection;
    }

    public void setPresenceCollection(Collection<Presence> presenceCollection) {
        this.presenceCollection = presenceCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (planningId != null ? planningId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Planning)) {
            return false;
        }
        Planning other = (Planning) object;
        if ((this.planningId == null && other.planningId != null) || (this.planningId != null && !this.planningId.equals(other.planningId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Planning[ planningId=" + planningId + " "
                + " rooom=" + room 
                + " seanceDate=" + seanceDate
                + " startHour=" + startHour
                + " organizedUeName=" + organizedUe.getName()
                + " teacher=" + teacher.getLastName() + "]";
    }
    
}
