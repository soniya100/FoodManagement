package Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.CustomerDetails;
import Model.FoodDetails;
import Repository.CustomerDetailRepo;
import Repository.FoodDetailRepo;

@Service
public class FoodDeliveryService {

	@Autowired
	FoodDetailRepo foodRepo;

	@Autowired
	CustomerDetailRepo customerRepo;

	public CustomerDetails saveFoodItems(CustomerDetails Customer) {
		return customerRepo.save(Customer);
	}

	public CustomerDetails update(CustomerDetails Customer) {
		Optional<CustomerDetails> checkId = customerRepo.findById(Customer.getId());
		if (checkId.isPresent()) {
			customerRepo.deleteById(Customer.getId());
			return customerRepo.save(Customer);
		}
		return Customer;
	}

	public CustomerDetails findFoodItemsById(Integer id) {
		Optional<CustomerDetails> idValue = customerRepo.findById(id);
		if (idValue.isPresent()) {
			return idValue.get();
		}
		return null;
	}

	public Boolean deleteFoodItemsById(Integer id) {
		CustomerDetails Customer = findFoodItemsById(id);
		if (Objects.nonNull(Customer)) {
			customerRepo.deleteById(id);
			return true;
		}
		return false;
	}

	public Map<String, Integer> getReceipt(int customerid) {
		Optional<FoodDetails> foodList = foodRepo.findById(customerid);
		List<Integer> foodListValue = null;
		Map<String, Integer> foodItemListMap = null;
		if (foodList.isPresent()) {
			foodListValue = (List<Integer>) foodList.get();
		}

		for (int i = 0; i < foodListValue.size(); i++) {
			foodItemListMap = new HashMap<>();
			foodItemListMap.put("Rice", foodListValue.get(i));
			foodItemListMap.put("Dhosa", foodListValue.get(i));
			foodItemListMap.put("Chapathi", foodListValue.get(i));
		}

		return foodItemListMap;
	}

}
