package entity;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Evaluation implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer evaluationId;
    
    private String comment;
    
    private String result;
    
    private Indicator indicatorId;
    
    private StudentOrganizedUe studentOrganizedUe;

    public Evaluation() {
    }

    public Evaluation(Integer evaluationId) {
        this.evaluationId = evaluationId;
    }

    public Integer getEvaluationId() {
        return evaluationId;
    }

    public void setEvaluationId(Integer evaluationId) {
        this.evaluationId = evaluationId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Indicator getIndicatorId() {
        return indicatorId;
    }

    public void setIndicatorId(Indicator indicatorId) {
        this.indicatorId = indicatorId;
    }

    public StudentOrganizedUe getStudentOrganizedUe() {
        return studentOrganizedUe;
    }

    public void setStudentOrganizedUe(StudentOrganizedUe studentOrganizedUe) {
        this.studentOrganizedUe = studentOrganizedUe;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (evaluationId != null ? evaluationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Evaluation)) {
            return false;
        }
        Evaluation other = (Evaluation) object;
        if ((this.evaluationId == null && other.evaluationId != null) || (this.evaluationId != null && !this.evaluationId.equals(other.evaluationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Evaluation[ evaluationId=" + evaluationId + " ]";
    }
    
}
