package manyToManyBiDireMap;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class StudentManyToManyBiDir {
	@Id
	private int studId;
	private String studName;
	@ManyToMany
	private List<SubjectManyToManyBiDir> subjects;
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public List<SubjectManyToManyBiDir> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<SubjectManyToManyBiDir> subjects) {
		this.subjects = subjects;
	}
	public StudentManyToManyBiDir() {
		super();
	}
	@Override
	public String toString() {
		return "StudentManyToManyBiDir [studId=" + studId + ", studName=" + studName + "]";
	}
	

}
