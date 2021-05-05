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

import tn.esprit.spring.service.IserviceRayon;

import tn.esprit.spring.entities.Rayon;




@RestController
@RequestMapping("/Rayon")
public class RayonRestController {

	
	@Autowired
	IserviceRayon rayonService;
	
	
	
	
	
	@GetMapping("/GetAllRayon")
	@ResponseBody
	public List<Rayon> getAllRayon(@PathVariable("id") int id) {
		List<Rayon> t = rayonService.retrieveAllRayon();
		return t;

	}
	
	@GetMapping("/GetRayon/{id}")
	@ResponseBody
	public Rayon getRayon(@PathVariable("id") int id) {
		Rayon t = rayonService.retrieveRayon(id);
		return t;

	}


	@PostMapping("/CreateRayon")
	@ResponseBody
	public Boolean createRayon(@RequestBody Rayon c) {
	
		rayonService.addRayon(c);
		return true;
	}
	
	@DeleteMapping("/RemoveRayon/{id}")
	public void deleteRayon(@PathVariable("id") int id) 
	{
		rayonService.deleteRayon(id);
	}
	

	

}
