

package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entities.Rayon;


public interface IserviceRayon {
	Rayon addRayon(Rayon R);

	void deleteRayon(int id);

	List<Rayon> retrieveAllRayon();

	Rayon retrieveRayon(int id);
}
