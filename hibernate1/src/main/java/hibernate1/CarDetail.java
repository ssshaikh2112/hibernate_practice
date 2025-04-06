package hibernate1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CarDetail {
	
	@Id
	private long  carNumber;
	private String carName;
	private int carPrice;
	private String carModel;
	public CarDetail(long carNumber, String carName, int carPrice, String carModel) {
		super();
		this.carNumber = carNumber;
		this.carName = carName;
		this.carPrice = carPrice;
		this.carModel = carModel;
	}
	public CarDetail() {
		super();
	}
	public long getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(long carNumber) {
		this.carNumber = carNumber;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public int getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

}
