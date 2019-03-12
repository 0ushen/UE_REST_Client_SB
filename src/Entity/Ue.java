package entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Ue implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer ueId;
    
    private String code;
    
    private String description;
    
    private Boolean isDecisive;
    
    private String name;
    
    private Integer numOfPeriods;
   
    private Section section;
   
    private Collection<OrganizedUe> organizedUeCollection;
   
    private List<Capacity> capacityList;

    public Ue() {
    }

    public Ue(Ue ue) {
        
        this.ueId = ue.ueId;
        this.code = ue.code;
        this.description = ue.description;
        this.isDecisive = ue.isDecisive;
        this.name = ue.name;
        this.numOfPeriods = ue.numOfPeriods;
        this.section = ue.section;
        this.organizedUeCollection = ue.organizedUeCollection;
        this.capacityList = ue.capacityList;
        
    }
    
    

    public Ue(Integer ueId) {
        this.ueId = ueId;
    }

    public Integer getUeId() {
        return ueId;
    }

    public void setUeId(Integer ueId) {
        this.ueId = ueId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsDecisive() {
        return isDecisive;
    }

    public void setIsDecisive(Boolean isDecisivee) {
        System.out.print(isDecisivee);
        this.isDecisive = isDecisivee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumOfPeriods() {
        return numOfPeriods;
    }

    public void setNumOfPeriods(Integer numOfPeriods) {
        this.numOfPeriods = numOfPeriods;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

   
    public Collection<OrganizedUe> getOrganizedUeCollection() {
        return organizedUeCollection;
    }

    public void setOrganizedUeCollection(Collection<OrganizedUe> organizedUeCollection) {
        this.organizedUeCollection = organizedUeCollection;
    }

   
    public List<Capacity> getCapacityList() {
        return capacityList;
    }

    public void setCapacityList(List<Capacity> capacityList) {
        this.capacityList = capacityList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ueId != null ? ueId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ue)) {
            return false;
        }
        Ue other = (Ue) object;
        if ((this.ueId == null && other.ueId != null) || (this.ueId != null && !this.ueId.equals(other.ueId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Ue[ ueId=" + ueId + " ]";
    }
    
}
