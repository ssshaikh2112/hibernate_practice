package assignmentEmpComp;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Company {
	@Id
	private int compId;
	private String compName;
	private String compLocation;
	@OneToMany
	private List<EmployeeData> empData;
	public int getCompId() {
		return compId;
	}
	public void setCompId(int compId) {
		this.compId = compId;
	}
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	public String getCompLocation() {
		return compLocation;
	}
	public void setCompLocation(String compLocation) {
		this.compLocation = compLocation;
	}
	public List<EmployeeData> getEmpData() {
		return empData;
	}
	public void setEmpData(List<EmployeeData> empData) {
		this.empData = empData;
	}
	public Company() {
		super();
	}
	

}
