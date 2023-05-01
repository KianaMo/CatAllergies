package fi.haagahelia.catAllergies.domain;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class CatFoodIntake {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String brand;
	private String ingredient;
	private double weight;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fidate;	
	private String symptom;
	
	@ManyToOne
	@JoinColumn(name = "foodcategoryid")
	private FoodCategory foodCategory;
	
	public CatFoodIntake() {}
	
	public CatFoodIntake(String brand, String ingredient, double weight, LocalDate date, FoodCategory foodCategory, String symptom) {
		super();
		this.brand=brand;
		this.ingredient= ingredient;
		this.weight= weight;
		this.fidate = date;
		this.foodCategory = foodCategory;
		this.symptom = symptom;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getIngredient() {
		return ingredient;
	}

	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public LocalDate getFidate() {
		return fidate;
	}

	public void setFidate(LocalDate fidate) {
		this.fidate = fidate;
	}
	
	public FoodCategory getFoodCategory() {
		return foodCategory;
	}

	public void setFoodCategory(FoodCategory foodCategory) {
		this.foodCategory = foodCategory;
	}
	
	public String getSymptom() {
		return symptom;
	}
	
	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}
}
