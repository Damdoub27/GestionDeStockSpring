

package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entities.Category;
import tn.esprit.spring.entities.Product;
import tn.esprit.spring.entities.Rayon;


public interface IserviceProduct {
	Product addProduct(Product D, Category c);

	void deleteProduct(int id);
	

	List<Product> retrieveAllProduct();
	

	Product retrieveProduct(int id);
}
