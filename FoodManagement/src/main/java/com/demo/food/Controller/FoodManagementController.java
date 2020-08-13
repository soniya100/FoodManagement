package Controller.;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Dto.OrderDetails;
import Model.CustomerDetails;
import Repository.RestarauntDetailRepo;
import Service.FoodDeliveryService;

@RestController
@RequestMapping("/foodDeliveryManagement")
public class FoodManagementController {

	@Autowired
	private FoodDeliveryService foodService;

	@Autowired
	private RestarauntDetailRepo restarauntRepo;

	/*
	 * getAlldata method is called to get restaurant details for desired location.
	 */
	@GetMapping("/restaurant/{location}")
	public List<OrderDetails> getAlldata(@PathVariable String location) {
		return restarauntRepo.getAllRestaurant(location);
	}

	/* This method used to describe the food which is added by the customer*/
	@PostMapping("order/item/add")
	public ResponseEntity<CustomerDetails> addFoodItems(@RequestBody CustomerDetails Customer) {
		CustomerDetails insertData = foodService.saveFoodItems(Customer);
		return new ResponseEntity<CustomerDetails>(Customer, HttpStatus.OK);
	}

	/* This method used to describe the food which is deleted by the customer*/
	@DeleteMapping("order/item/{customerId}")
	public ResponseEntity<Void> deleteFoodItems(@PathVariable int customerId) {
		if (foodService.deleteFoodItemsById(customerId)) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.notFound().build();
	}

	/* updateFoodDetail method is called to update food items by customer */
	@PutMapping("order/item/{customerId}")
	public ResponseEntity<CustomerDetails> updateFoodDetail(@RequestBody CustomerDetails Customer) {
		CustomerDetails updateDetails = foodService.saveFoodItems(Customer);
		return new ResponseEntity<CustomerDetails>(Customer, HttpStatus.OK);
	}

	/* getAllReceipt method is called to get a receipt details */
	@GetMapping("order/item/{customerId}")
	public Map<String, Integer> getAllReceipt(@PathVariable int customerId) {
		return foodService.getReceipt(customerId);
	}
}
