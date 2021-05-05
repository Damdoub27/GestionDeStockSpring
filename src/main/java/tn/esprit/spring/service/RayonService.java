package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Rayon;
import tn.esprit.spring.repositories.RayonRepository;

@Service
public class RayonService implements IserviceRayon {

	@Autowired 
	RayonRepository rayonRepository;
	


	@Override
	public Rayon addRayon(Rayon r) {
		Rayon demand = rayonRepository.save(r);
		return demand;
	}
	

	@Override
	public void deleteRayon(int id) {
		rayonRepository.deleteById(id);
		
	}

	@Override
	public List<Rayon>retrieveAllRayon() {
		List<Rayon> rayons = (List<Rayon>) rayonRepository.findAll();
		return rayons;
	}

	@Override
	public Rayon retrieveRayon(int id) {
		Optional<Rayon> rayonOptional = rayonRepository.findById(id);
		Rayon c = rayonOptional.get();
		return c;
	}

}
