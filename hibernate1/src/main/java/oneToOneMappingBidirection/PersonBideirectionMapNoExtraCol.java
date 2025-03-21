package oneToOneMappingBidirection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class PersonBideirectionMapNoExtraCol 
{
	@Id
	private int id;
	private String name;
	private long phone;
	
	@OneToOne
	@JoinColumn(name = "card_id")
	private AdharCardBideirectionMapNoExtraCol card;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public AdharCardBideirectionMapNoExtraCol getCard() {
		return card;
	}

	public void setCard(AdharCardBideirectionMapNoExtraCol adhar) {
		this.card = adhar;
	}
	

	

	public PersonBideirectionMapNoExtraCol() {
		super();
	}

	@Override
	public String toString() {
		return "PersonBidirectionMapping [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}

}
