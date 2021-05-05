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

import tn.esprit.spring.service.IserviceProduct;

import tn.esprit.spring.entities.Product;




@RestController
@RequestMapping("/Product")
public class ProductRestController {

	
	@Autowired
	IserviceProduct productService;
	
	
	
	
	
	@GetMapping("/GetAllProduct")
	@ResponseBody
	public List<Product> getAllProduct(@PathVariable("id") int id) {
		List<Product> t = productService.retrieveAllProduct();
		return t;

	}
	
	@GetMapping("/GetProduct/{id}")
	@ResponseBody
	public Product getProduct(@PathVariable("id") int id) {
		Product t = productService.retrieveProduct(id);
		return t;

	}


	@PostMapping("/CreateProduct")
	@ResponseBody
	public Boolean createProduct(@RequestBody Product c) {
	
		productService.addProduct(c);
		return true;
	}
	
	@DeleteMapping("/RemoveProduct/{id}")
	public void deleteProduct(@PathVariable("id") int id) 
	{
		productService.deleteProduct(id);
	}
	

	

}
