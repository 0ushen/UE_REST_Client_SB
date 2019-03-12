package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Level implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer levelId;
    private String name;
    private Collection<OrganizedUe> organizedUeCollection;

    public Level() {
    }

    public Level(Integer levelId) {
        this.levelId = levelId;
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Collection<OrganizedUe> getOrganizedUeCollection() {
        return organizedUeCollection;
    }

    public void setOrganizedUeCollection(Collection<OrganizedUe> organizedUeCollection) {
        this.organizedUeCollection = organizedUeCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (levelId != null ? levelId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Level)) {
            return false;
        }
        Level other = (Level) object;
        if ((this.levelId == null && other.levelId != null) || (this.levelId != null && !this.levelId.equals(other.levelId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Level[ levelId=" + levelId + " ]";
    }
    
}
