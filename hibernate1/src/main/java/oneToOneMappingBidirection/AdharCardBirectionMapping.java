package oneToOneMappingBidirection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class AdharCardBirectionMapping {

	@Id
	private int adharNumber;
	private String address;
	
	public PersonBidirectionMapping getPerson() {
		return person;
	}

	public void setPerson(PersonBidirectionMapping person) {
		this.person = person;
	}

	@OneToOne
	private PersonBidirectionMapping person;

	public AdharCardBirectionMapping() {
		super();
	}

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

	@Override
	public String toString() {
		return "AdharCardBirectionMapping [adharNumber=" + adharNumber + ", address=" + address + "]";
	}
}
