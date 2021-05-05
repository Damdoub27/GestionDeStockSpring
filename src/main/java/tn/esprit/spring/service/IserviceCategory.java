

package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entities.Category;



public interface IserviceCategory {
	Category addCategory(Category D);

	void deleteCategory(int id);

	List<Category> retrieveAllCategory();

	Category retrieveCategory(int id);
}
