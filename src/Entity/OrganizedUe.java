package entity;


import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


@XmlRootElement
public class OrganizedUe implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer organizedUeId;
   
    private Date endDate;
   
    private String name;
  
    private Date startDate;
    
    private List<Person> teacherList;
   
    private Collection<Indicator> indicatorCollection;
    
    private List<Planning> planningList;
    
    private Collection<StudentOrganizedUe> studentOrganizedUeCollection;
    
    private Level level;
   
    private Ue ue;

    public OrganizedUe() {
    }
    
    // Constructor by copy
    public OrganizedUe(OrganizedUe o) {
        this.name = o.getName();
        this.startDate = o.getStartDate();
        this.endDate = o.getEndDate();
        this.teacherList = o.getTeacherList();
        //this.indicatorCollection = o.getIndicatorCollection();
        //this.planningCollection = o.getPlanningCollection();
        //this.studentOrganizedUeCollection = o.getStudentOrganizedUeCollection();
        this.level = o.getLevel();
        this.ue = o.getUe();
    }

    public OrganizedUe(Integer organizedUeId) {
        this.organizedUeId = organizedUeId;
    }

    public Integer getOrganizedUeId() {
        return organizedUeId;
    }

    public void setOrganizedUeId(Integer organizedUeId) {
        this.organizedUeId = organizedUeId;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }


    public List<Person> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Person> teacherList) {
        this.teacherList = teacherList;
    }


    public Collection<Indicator> getIndicatorCollection() {
        return indicatorCollection;
    }

    public void setIndicatorCollection(Collection<Indicator> indicatorCollection) {
        this.indicatorCollection = indicatorCollection;
    }
    

    public List<Planning> getPlanningList() {
        return planningList;
    }

    public void setPlanningList(List<Planning> planningList) {
        this.planningList = planningList;
    }


    public Collection<StudentOrganizedUe> getStudentOrganizedUeCollection() {
        return studentOrganizedUeCollection;
    }

    public void setStudentOrganizedUeCollection(Collection<StudentOrganizedUe> studentOrganizedUeCollection) {
        this.studentOrganizedUeCollection = studentOrganizedUeCollection;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Ue getUe() {
        return ue;
    }

    public void setUe(Ue ue) {
        this.ue = ue;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (organizedUeId != null ? organizedUeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrganizedUe)) {
            return false;
        }
        OrganizedUe other = (OrganizedUe) object;
        if ((this.organizedUeId == null && other.organizedUeId != null) || (this.organizedUeId != null && !this.organizedUeId.equals(other.organizedUeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.OrganizedUe[ organizedUeId=" + organizedUeId + " ]";
    }
    
}
