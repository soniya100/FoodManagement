package Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class RestaurantDetails {

	private int restaurantId;
	private String resturantName;
	private String resturantLocation;
	private float resturantRating;

	@OneToMany(targetEntity = FoodDetails.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "cp_fk", referencedColumnName = "restaurantId")

	private List<FoodDetails> fooditems;

	public RestaurantDetails() {

	}

	public RestaurantDetails(int restaurantId, String resturantName, String resturantLocation, float resturantRating,
			List<FoodDetails> fooditems) {
		super();
		this.restaurantId = restaurantId;
		this.resturantName = resturantName;
		this.resturantLocation = resturantLocation;
		this.resturantRating = resturantRating;
		this.fooditems = fooditems;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
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

	public List<FoodDetails> getFooditems() {
		return fooditems;
	}

	public void setFooditems(List<FoodDetails> fooditems) {
		this.fooditems = fooditems;
	}

}
