package fi.haagahelia.catAllergies;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import fi.haagahelia.catAllergies.domain.User;
import fi.haagahelia.catAllergies.domain.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import fi.haagahelia.catAllergies.domain.CatFoodIntake;
import fi.haagahelia.catAllergies.domain.CatFoodIntakeRepository;
import fi.haagahelia.catAllergies.domain.FoodCategory;
import fi.haagahelia.catAllergies.domain.FoodCategoryRepository;

@SpringBootApplication
public class CatAllergiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatAllergiesApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CatFoodIntakeRepository repository, FoodCategoryRepository categoryRepo,
			UserRepository userRepo) {
		return (args) -> {

			
			/*
			 * FoodCategory foodcategory1 = new FoodCategory("Wet"); FoodCategory
			 * foodcategory2 = new FoodCategory("Dry"); FoodCategory foodcategory3 = new
			 * FoodCategory("Treat");
			 * 
			 * categoryRepo.save(foodcategory1); categoryRepo.save(foodcategory2);
			 * categoryRepo.save(foodcategory3);
			 */
			

			/*
			 * CatFoodIntake catfood1 = new CatFoodIntake("Latz", "Salmon", 80,
			 * LocalDate.now(), foodcategory1); CatFoodIntake catfood2 = new
			 * CatFoodIntake("Royal Canin", "Different Proteins", 30, LocalDate.now(),
			 * foodcategory2); CatFoodIntake catfood3 = new CatFoodIntake("Driemies",
			 * "Salmon", 5, LocalDate.now(), foodcategory3);
			 * 
			 * repository.save(catfood1); repository.save(catfood2);
			 * repository.save(catfood3);
			 */

			/*
			 * BCryptPasswordEncoder bcPasswordEncoder = new BCryptPasswordEncoder(); User
			 * user1 = new User("Kiana",
			 * bcPasswordEncoder.encode("Il0v$myc@t4EvEr"),"ROLE_USER"); User user2= new
			 * User("Ari", bcPasswordEncoder.encode("13623%#@PoK"),"ROLE_ADMIN"); User user3
			 * = new User("user", bcPasswordEncoder.encode("user"),"ROLE_USER"); User user4=
			 * new User("admin", bcPasswordEncoder.encode("admin"),"ROLE_ADMIN");
			 * userRepo.save(user1); userRepo.save(user2); userRepo.save(user3);
			 * userRepo.save(user4);
			 */

		};
	}
}
