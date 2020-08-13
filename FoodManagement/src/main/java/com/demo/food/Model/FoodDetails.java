package Model;

import javax.persistence.Id;

public class FoodDetails {

	@Id
	private int foodId;
	private String foodName;
	private String foodPrice;

	public FoodDetails() {

	}

	public FoodDetails(int foodId, String foodName, String foodPrice) {
		super();
		this.foodId = foodId;
		this.foodName = foodName;
		this.foodPrice = foodPrice;
	}

	public int getFoodId() {
		return foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
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

}
