package fi.haagahelia.catAllergies.web;

import fi.haagahelia.catAllergies.domain.CatFoodIntake;
import fi.haagahelia.catAllergies.domain.CatFoodIntakeRepository;
import fi.haagahelia.catAllergies.domain.FoodCategoryRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;

@Controller
public class CatAllergiesController {
	public List<CatFoodIntake> foods = new ArrayList<CatFoodIntake>();
	@Autowired
	private CatFoodIntakeRepository foodRepository;
	@Autowired
	private FoodCategoryRepository categoryRepository;
	
	@RequestMapping("/foodlist")
	public String foods(Model model) {
		model.addAttribute("foods", foodRepository.findAll());
		return "foodlist";
		
	}
	
    @RequestMapping("/login")
	public String login() {
		return "login";
	}
    
    @RequestMapping(value = "/add")
	public String addFood(Model model){
	 model.addAttribute("food", new CatFoodIntake());
	 model.addAttribute("categories", categoryRepository.findAll());
	 return "addfood";
	}
    
	@RequestMapping(value = "/edit/{id}")
	public String editFood(@PathVariable("id") Long id, Model model){
	 model.addAttribute("food", foodRepository.findById(id));
	 model.addAttribute("categories", categoryRepository.findAll());
	 return "editfood";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(CatFoodIntake food){
	 foodRepository.save(food);
	 return "redirect:foodlist";
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	@PreAuthorize("hasRole('ADMIN')")
	public String deleteFood(@PathVariable("id") Long id, Model model){ 
		foodRepository.deleteById(id);
	 return "redirect:../foodlist";
	}
	
	@GetMapping("/index")
	public String foodForm(Model model) {
		model.addAttribute("foods", foods);
		return  "result";
	}
	
	@PostMapping("/index")
	public String bookSubmit(@ModelAttribute CatFoodIntake newFood, Model model) {
		foods.add(newFood);	
		model.addAttribute("foods", foods);
		return  "redirect:/index";
	}
}



