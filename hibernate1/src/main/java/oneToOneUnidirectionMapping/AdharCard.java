package oneToOneUnidirectionMapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AdharCard {

	@Id
	private int adharNumber;
	private String address;

	public int getAdharNumber() {
		return adharNumber;
	}

	public void setAdharNumber(int adharNumber) {
		this.adharNumber = adharNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public AdharCard() {
		super();
	}
	

}
