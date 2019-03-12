package entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


@XmlRootElement
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer personId;
    
    private String address;
    
    private String city;
    
    private String country;
    
    private Date dateOfBirth;
    
    
    private String email;
    
    private String firstName;
    
    private Boolean isJuryMember;
   
    private Boolean isTeacher;
    
    private String lastName;
    
    private String mobile;
    
    private String postalCode;
    
    private List<OrganizedUe> organizedUeTeacherList;
    
    private Collection<Planning> planningCollection;
    
    private Collection<StudentOrganizedUe> studentOrganizedUeCollection;
    
    private Collection<Section> sectionCollection;
   
    private Collection<Presence> presenceCollection;

    public Person() {
    }

    public Person(Person person) {
        this.personId = person.personId;
        this.address = person.address;
        this.city = person.city;
        this.country = person.country;
        this.dateOfBirth = person.dateOfBirth;
        this.email = person.email;
        this.firstName = person.firstName;
        this.isJuryMember = person.isJuryMember;
        this.isTeacher = person.isTeacher;
        this.lastName = person.lastName;
        this.mobile = person.mobile;
        this.postalCode = person.postalCode;
        this.organizedUeTeacherList = person.organizedUeTeacherList;
        this.planningCollection = person.planningCollection;
        this.studentOrganizedUeCollection = person.studentOrganizedUeCollection;
        this.sectionCollection = person.sectionCollection;
        this.presenceCollection = person.presenceCollection;
    }
    
    

    public Person(Integer personId) {
        this.personId = personId;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Boolean getIsJuryMember() {
        return isJuryMember;
    }

    public void setIsJuryMember(Boolean isJuryMember) {
        this.isJuryMember = isJuryMember;
    }

    public Boolean getIsTeacher() {
        return isTeacher;
    }

    public void setIsTeacher(Boolean isTeacher) {
        this.isTeacher = isTeacher;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }


    public List<OrganizedUe> getOrganizedUeTeacherList() {
        return organizedUeTeacherList;
    }

    public void setOrganizedUeTeacherList(List<OrganizedUe> organizedUeTeacherList) {
        this.organizedUeTeacherList = organizedUeTeacherList;
    }
    
    
    public Collection<Planning> getPlanningCollection() {
        return planningCollection;
    }

    public void setPlanningCollection(Collection<Planning> planningCollection) {
        this.planningCollection = planningCollection;
    }

    public Collection<StudentOrganizedUe> getStudentOrganizedUeCollection() {
        return studentOrganizedUeCollection;
    }

    public void setStudentOrganizedUeCollection(Collection<StudentOrganizedUe> studentOrganizedUeCollection) {
        this.studentOrganizedUeCollection = studentOrganizedUeCollection;
    }


    public Collection<Section> getSectionCollection() {
        return sectionCollection;
    }

    public void setSectionCollection(Collection<Section> sectionCollection) {
        this.sectionCollection = sectionCollection;
    }

    public Collection<Presence> getPresenceCollection() {
        return presenceCollection;
    }

    public void setPresenceCollection(Collection<Presence> presenceCollection) {
        this.presenceCollection = presenceCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (personId != null ? personId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Person)) {
            return false;
        }
        Person other = (Person) object;
        if ((this.personId == null && other.personId != null) || (this.personId != null && !this.personId.equals(other.personId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Person{" + 
                "id=" + personId + 
                ", firstName=" + firstName + 
                ", lastName=" + lastName + 
                ", country=" + country + 
                ", city=" + city + 
                ", postalCode=" + postalCode + 
                ", address=" + address + 
                ", dateOfBirth=" + dateOfBirth + 
                ", email=" + email + 
                ", isTeacher=" + isTeacher + 
                ", mobile=" + mobile +
                '}';
    }
    
}
