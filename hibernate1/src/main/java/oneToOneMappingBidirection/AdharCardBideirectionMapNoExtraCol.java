package oneToOneMappingBidirection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class AdharCardBideirectionMapNoExtraCol {


	@Id
	private int adharNumber;
	private String address;
	
	public PersonBideirectionMapNoExtraCol getPerson() {
		return person;
	}

	public void setPerson(PersonBideirectionMapNoExtraCol person2) {
		this.person = person2;
	}

	@OneToOne(mappedBy ="card")
	private PersonBideirectionMapNoExtraCol person;

	

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
	

	public AdharCardBideirectionMapNoExtraCol() {
		super();
	}

	@Override
	public String toString() {
		return "AdharCardBirectionMapping [adharNumber=" + adharNumber + ", address=" + address + "]";
	}
	
}
