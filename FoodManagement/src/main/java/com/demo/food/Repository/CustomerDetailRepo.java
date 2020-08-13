package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Model.CustomerDetails;

public interface CustomerDetailRepo extends JpaRepository<CustomerDetails, Integer>{

}
