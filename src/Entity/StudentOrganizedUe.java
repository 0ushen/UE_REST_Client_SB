package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class StudentOrganizedUe implements Serializable {

    private static final long serialVersionUID = 1L;
    protected StudentOrganizedUePK studentOrganizedUePK;
    private String comment;
    private Collection<Evaluation> evaluationCollection;
    private OrganizedUe organizedUe;
    private Person person;

    public StudentOrganizedUe() {
    }

    public StudentOrganizedUe(StudentOrganizedUePK studentOrganizedUePK) {
        this.studentOrganizedUePK = studentOrganizedUePK;
    }

    public StudentOrganizedUe(int personId, int organizedUeId) {
        this.studentOrganizedUePK = new StudentOrganizedUePK(personId, organizedUeId);
    }

    public StudentOrganizedUePK getStudentOrganizedUePK() {
        return studentOrganizedUePK;
    }

    public void setStudentOrganizedUePK(StudentOrganizedUePK studentOrganizedUePK) {
        this.studentOrganizedUePK = studentOrganizedUePK;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Collection<Evaluation> getEvaluationCollection() {
        return evaluationCollection;
    }

    public void setEvaluationCollection(Collection<Evaluation> evaluationCollection) {
        this.evaluationCollection = evaluationCollection;
    }

    public OrganizedUe getOrganizedUe() {
        return organizedUe;
    }

    public void setOrganizedUe(OrganizedUe organizedUe) {
        this.organizedUe = organizedUe;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentOrganizedUePK != null ? studentOrganizedUePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StudentOrganizedUe)) {
            return false;
        }
        StudentOrganizedUe other = (StudentOrganizedUe) object;
        if ((this.studentOrganizedUePK == null && other.studentOrganizedUePK != null) || (this.studentOrganizedUePK != null && !this.studentOrganizedUePK.equals(other.studentOrganizedUePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.StudentOrganizedUe[ studentOrganizedUePK=" + studentOrganizedUePK + " ]";
    }
    
}
