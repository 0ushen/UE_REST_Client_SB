package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;



@XmlRootElement
public class Section implements Serializable {

   
    private Integer sectionId;
   
    private String description;
    
    private String name;
    
    private Collection<Ue> ueCollection;
    
    private Person teacher;

    public Section() {
    }

    public Section(String description, String name, Person teacher) {
        this.description = description;
        this.name = name;
        this.teacher = teacher;
    }
    
    
    
    public Section(Section section) {
        
        this.sectionId = section.sectionId;
        this.description = section.description;
        this.name = section.name;
        this.ueCollection = section.ueCollection;
        this.teacher = section.teacher;
        
    }
    
    public Section(Integer sectionId) {
        this.sectionId = sectionId;
    }

    public Integer getSectionId() {
        return sectionId;
    }

    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public Collection<Ue> getUeCollection() {
        return ueCollection;
    }

    public void setUeCollection(Collection<Ue> ueCollection) {
        this.ueCollection = ueCollection;
    }

    public Person getTeacher() {
        return teacher;
    }

    public void setTeacher(Person teacher) {
        this.teacher = teacher;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sectionId != null ? sectionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Section)) {
            return false;
        }
        Section other = (Section) object;
        if ((this.sectionId == null && other.sectionId != null) || (this.sectionId != null && !this.sectionId.equals(other.sectionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Section[ "
                + "Id = " + sectionId 
                + "  | name = " + name
                + "  | teacher = " + teacher.getLastName()
                + "  | description = " + description
                + " ]\n";
    }
    
}
