package oneToManyUnidirectionMapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account 
{
	@Id
	private int accountID;
	private String name;
	private double balanace;
	public int getAccountID() {
		return accountID;
	}
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalanace() {
		return balanace;
	}
	public void setBalanace(double balanace) {
		this.balanace = balanace;
	}
	public Account() {
		super();
	}
	@Override
	public String toString() {
		return "Account [accountID=" + accountID + ", name=" + name + ", balanace=" + balanace + "]";
	}
	

}
