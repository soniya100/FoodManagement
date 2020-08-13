package Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Dto.OrderDetails;
import Model.RestaurantDetails;

public interface RestarauntDetailRepo extends JpaRepository<RestaurantDetails,Integer> {
	
	@Query("SELECT new Dto.OrderDetails(r.resturantName , r.resturantLocation , r.resturantRating , f.foodName , f.foodRate) FROM Restaurant r JOIN r.fooditems f WHERE resturantLocation=?")	

	
	public List<OrderDetails> getAllRestaurant(String location);

}
