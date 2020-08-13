package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import Model.FoodDetails;

@Repository
@EnableJpaRepositories
public interface FoodDetailRepo extends JpaRepository<FoodDetails, Integer>{

}
