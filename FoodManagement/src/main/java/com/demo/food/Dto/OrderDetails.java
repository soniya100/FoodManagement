package com.demo.food.Dto;

public class OrderDetails {

	private String resturantName;
	private String resturantLocation;
	private float resturantRating;
	private String foodName;
	private String foodPrice;

	public OrderDetails() {

	}

	public OrderDetails(String resturantName, String resturantLocation, float resturantRating, String foodName,
			String foodPrice) {
		super();
		this.resturantName = resturantName;
		this.resturantLocation = resturantLocation;
		this.resturantRating = resturantRating;
		this.foodName = foodName;
		this.foodPrice = foodPrice;
	}

	public String getResturantName() {
		return resturantName;
	}

	public void setResturantName(String resturantName) {
		this.resturantName = resturantName;
	}

	public String getResturantLocation() {
		return resturantLocation;
	}

	public void setResturantLocation(String resturantLocation) {
		this.resturantLocation = resturantLocation;
	}

	public float getResturantRating() {
		return resturantRating;
	}

	public void setResturantRating(float resturantRating) {
		this.resturantRating = resturantRating;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(String foodPrice) {
		this.foodPrice = foodPrice;
	}

	@Override
	public String toString() {
		return "OrderResponseDetails [resturantName=" + resturantName + ", resturantLocation=" + resturantLocation
				+ ", resturantRating=" + resturantRating + ", foodName=" + foodName + ", foodPrice=" + foodPrice + "]";
	}
}
