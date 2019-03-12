package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Indicator implements Serializable {

    private static final long serialVersionUID = 1L;
   
    private Integer indicatorId;
    
    private String description;
    
    private Boolean isCriteria;
    
    private String maxPossible;
    
    private String name;
    
    private Collection<Evaluation> evaluationCollection;
    
    private Capacity capacity;
    
    private Collection<Indicator> indicatorCollection;
   
    private Indicator parentIndicatorId;
    
    private OrganizedUe organizedUeId;

    public Indicator() {
    }

    public Indicator(Integer indicatorId) {
        this.indicatorId = indicatorId;
    }

    public Integer getIndicatorId() {
        return indicatorId;
    }

    public void setIndicatorId(Integer indicatorId) {
        this.indicatorId = indicatorId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsCriteria() {
        return isCriteria;
    }

    public void setIsCriteria(Boolean isCriteria) {
        this.isCriteria = isCriteria;
    }

    public String getMaxPossible() {
        return maxPossible;
    }

    public void setMaxPossible(String maxPossible) {
        this.maxPossible = maxPossible;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public Collection<Evaluation> getEvaluationCollection() {
        return evaluationCollection;
    }

    public void setEvaluationCollection(Collection<Evaluation> evaluationCollection) {
        this.evaluationCollection = evaluationCollection;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

   
    public Collection<Indicator> getIndicatorCollection() {
        return indicatorCollection;
    }

    public void setIndicatorCollection(Collection<Indicator> indicatorCollection) {
        this.indicatorCollection = indicatorCollection;
    }

    public Indicator getParentIndicatorId() {
        return parentIndicatorId;
    }

    public void setParentIndicatorId(Indicator parentIndicatorId) {
        this.parentIndicatorId = parentIndicatorId;
    }

    public OrganizedUe getOrganizedUeId() {
        return organizedUeId;
    }

    public void setOrganizedUeId(OrganizedUe organizedUeId) {
        this.organizedUeId = organizedUeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (indicatorId != null ? indicatorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Indicator)) {
            return false;
        }
        Indicator other = (Indicator) object;
        if ((this.indicatorId == null && other.indicatorId != null) || (this.indicatorId != null && !this.indicatorId.equals(other.indicatorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Indicator[ indicatorId=" + indicatorId + " ]";
    }
    
}
