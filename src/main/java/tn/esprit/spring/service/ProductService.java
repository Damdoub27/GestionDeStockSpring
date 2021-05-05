package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Category;
import tn.esprit.spring.entities.Product;
import tn.esprit.spring.repositories.CategoryRepository;
import tn.esprit.spring.repositories.ProductRepository;

@Service
public class ProductService implements IserviceProduct {

	@Autowired 
	ProductRepository productRepository;
	
	@Autowired 
	CategoryRepository categoryRepository;

	@Override
	public Product addProduct(Product p , Category c) {
		
		Product product = productRepository.save(p);
		c.getProducts().add(p) ;
		categoryRepository.save(c);
		return product;
	}
	

	@Override
	public void deleteProduct(int id) {
		productRepository.deleteById(id);
		
	}

	@Override
	public List<Product>retrieveAllProduct() {
		List<Product> products = (List<Product>) productRepository.findAll();
		return products;
	}

	@Override
	public Product retrieveProduct(int id) {
		Optional<Product> productOptional = productRepository.findById(id);
		Product c = productOptional.get();
		return c;
	}

}
