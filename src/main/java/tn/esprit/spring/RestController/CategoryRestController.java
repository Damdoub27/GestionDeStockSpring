package tn.esprit.spring.RestController;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.service.IserviceCategory;

import tn.esprit.spring.entities.Category;




@RestController
@RequestMapping("/Category")
public class CategoryRestController {

	
	@Autowired
	IserviceCategory categoryService;
	
	
	
	
	
	@GetMapping("/GetAllCategory")
	@ResponseBody
	public List<Category> getAllCategory(@PathVariable("id") int id) {
		List<Category> t = categoryService.retrieveAllCategory();
		return t;

	}
	
	@GetMapping("/GetCategory/{id}")
	@ResponseBody
	public Category getCategory(@PathVariable("id") int id) {
		Category t = categoryService.retrieveCategory(id);
		return t;

	}


	@PostMapping("/CreateCategory")
	@ResponseBody
	public Boolean createCategory(@RequestBody Category c) {
	
		categoryService.addCategory(c);
		return true;
	}
	
	@DeleteMapping("/RemoveCategory/{id}")
	public void deleteCategory(@PathVariable("id") int id) 
	{
		categoryService.deleteCategory(id);
	}
	

	

}
