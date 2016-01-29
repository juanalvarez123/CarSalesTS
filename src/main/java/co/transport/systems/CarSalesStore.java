package co.transport.systems;

public class CarSalesStore {

	private String name;
	private String city;
	private String address;
	private Double averageCarRentalPrice;
	private Double latitude;
	private Double longitude;

	public CarSalesStore(String name, String city, String address, Double averageCarRentalPrice, Double latitude,
			Double longitude) {
		this.name = name;

		this.city = city;

		this.address = address;

		this.averageCarRentalPrice = averageCarRentalPrice;

		this.latitude = latitude;

		this.longitude = longitude;

	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public String getCity() {

		return city;
	}

	public void setCity(String city) {

		this.city = city;
	}

	public String getAddress() {

		return address;
	}

	public void setAddress(String address) {

		this.address = address;
	}

	public Double getAverageCarRentalPrice() {

		return averageCarRentalPrice;
	}

	public void setAverageCarRentalPrice(Double averageCarRentalPrice) {

		this.averageCarRentalPrice = averageCarRentalPrice;
	}

	public Double getLatitude() {

		return latitude;
	}

	public void setLatitude(Double latitude) {

		this.latitude = latitude;
	}

	public Double getLongitude() {

		return longitude;
	}

	public void setLongitude(Double longitude) {

		this.longitude = longitude;
	}

}
