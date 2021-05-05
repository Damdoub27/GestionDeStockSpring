package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Category;
import tn.esprit.spring.repositories.CategoryRepository;

@Service
public class CategoryService implements IserviceCategory {

	@Autowired 
	CategoryRepository categoryRepository;
	


	@Override
	public Category addCategory(Category r) {
		Category category = categoryRepository.save(r);
		return category;
	}
	

	@Override
	public void deleteCategory(int id) {
		categoryRepository.deleteById(id);
		
	}

	@Override
	public List<Category>retrieveAllCategory() {
		List<Category> categorys = (List<Category>) categoryRepository.findAll();
		return categorys;
	}

	@Override
	public Category retrieveCategory(int id) {
		Optional<Category> categoryOptional = categoryRepository.findById(id);
		Category c = categoryOptional.get();
		return c;
	}

}
