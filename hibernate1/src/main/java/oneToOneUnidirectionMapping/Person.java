package oneToOneUnidirectionMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {

	@Id
	private int id;
	private String name;
	private long phone;
	@OneToOne /*
				 * has a relation with one to one unidirection 	These table add a extra column
				 * with using another tables Primary key.
				 */
	private AdharCard adharCard;

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

	public AdharCard getAdharCard() {
		return adharCard;
	}

	public void setAdharCard(AdharCard adharCard) {
		this.adharCard = adharCard;
	}

	public Person() {
		super();
	}
}
