package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


@XmlRootElement
public class Capacity implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer capacityId;
    
    private String description;
    
    private Boolean isThresholdOfSuccess;
    
    private String name;
    
    private Collection<Indicator> indicatorCollection;
    
    private Ue ue;
    

    public Capacity() {
    }
    
    // Constructor by copy
    public Capacity(Capacity capacity) {
        
        this.capacityId = capacity.capacityId;
        this.description = capacity.description;
        this.isThresholdOfSuccess = capacity.isThresholdOfSuccess;
        this.name = capacity.name;
        this.indicatorCollection = capacity.indicatorCollection;
        this.ue = capacity.ue;
        
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (capacityId != null ? capacityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Capacity)) {
            return false;
        }
        Capacity other = (Capacity) object;
        if ((this.capacityId == null && other.capacityId != null) || (this.capacityId != null && !this.capacityId.equals(other.capacityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Capacity[ capacityId=" + capacityId + " ]";
    }
    
    

    public Capacity(Integer capacityId) {
        this.capacityId = capacityId;
    }

    public Integer getCapacityId() {
        return capacityId;
    }

    public void setCapacityId(Integer capacityId) {
        this.capacityId = capacityId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsThresholdOfSuccess() {
        return isThresholdOfSuccess;
    }

    public void setIsThresholdOfSuccess(Boolean isThresholdOfSuccess) {
        this.isThresholdOfSuccess = isThresholdOfSuccess;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Indicator> getIndicatorCollection() {
        return indicatorCollection;
    }

    public void setIndicatorCollection(Collection<Indicator> indicatorCollection) {
        this.indicatorCollection = indicatorCollection;
    }

    public Ue getUe() {
        return ue;
    }

    public void setUe(Ue ue) {
        this.ue = ue;
    }
    
    
    
}
