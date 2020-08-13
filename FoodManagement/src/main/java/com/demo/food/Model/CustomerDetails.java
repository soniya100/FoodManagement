package Model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class CustomerDetails {

	@Id
	@GeneratedValue
	private int id;
	private int customerId;
	private String customerName;
	private int restaurantId;
	private int foodId;
	private int foodQuantity;
	private String foodPrice;

	public CustomerDetails() {

	}

	public CustomerDetails(int id, int customerId, int restaurantId, int foodId, int foodQuantity,
			String customerName) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.restaurantId = restaurantId;
		this.foodId = foodId;
		this.foodQuantity = foodQuantity;
		this.customerName = customerName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public int getFoodId() {
		return foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

	public int getFoodQuantity() {
		return foodQuantity;
	}

	public void setFoodQuantity(int foodQuantity) {
		this.foodQuantity = foodQuantity;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

}
