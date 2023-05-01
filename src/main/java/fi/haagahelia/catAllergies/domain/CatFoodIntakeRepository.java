package fi.haagahelia.catAllergies.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CatFoodIntakeRepository extends CrudRepository<CatFoodIntake, Long>{
	List<CatFoodIntake> findByBrand(@Param("brand") String brand);
	List<CatFoodIntake> findByIngredient(@Param("ingredient") String ingredient);
	List<CatFoodIntake> findBySymptom(@Param("symptom") String symptom);
}
