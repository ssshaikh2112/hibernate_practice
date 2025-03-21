package oneToOneMappingBidirection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class PersonBidirectionMapping 
{
	@Id
	private int id;
	private String name;
	private long phone;
	
	@OneToOne
	private AdharCardBirectionMapping card;

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

	public AdharCardBirectionMapping getCard() {
		return card;
	}

	public void setCard(AdharCardBirectionMapping card) {
		this.card = card;
	}
	

	public PersonBidirectionMapping() {
		super();
	}

	@Override
	public String toString() {
		return "PersonBidirectionMapping [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}
	
}
