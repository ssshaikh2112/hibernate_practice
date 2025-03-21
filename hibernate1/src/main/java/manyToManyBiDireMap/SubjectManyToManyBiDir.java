package manyToManyBiDireMap;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class SubjectManyToManyBiDir {
	@Id
	private int subId;
	private String subName;
	@ManyToMany(mappedBy = "subjects")
	private List<StudentManyToManyBiDir> students;
	public int getSubId() {
		return subId;
	}
	public void setSubId(int subId) {
		this.subId = subId;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public List<StudentManyToManyBiDir> getStudents() {
		return students;
	}
	public void setStudents(List<StudentManyToManyBiDir> students) {
		this.students = students;
	}
	public SubjectManyToManyBiDir() {
		super();
	}
	@Override
	public String toString() {
		return "SubjectManyToManyBiDir [subId=" + subId + ", subName=" + subName + "]";
	}
	
	

}
