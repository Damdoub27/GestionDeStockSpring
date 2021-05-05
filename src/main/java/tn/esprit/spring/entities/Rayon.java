package tn.esprit.spring.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "T_Rayon")
public class Rayon {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Rayon_id")
	private Long id;
	private String nom;
	@Enumerated(EnumType.STRING)
	private TypeProduct type;
	
	private List<Category> categories ;
	
	
	public List<Category> getCategories() {
		return categories;
	}
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public TypeProduct getType() {
		return type;
	}
	public void setType(TypeProduct type) {
		this.type = type;
	}
	public Rayon(Long id, String nom, TypeProduct type) {
		super();
		this.id = id;
		this.nom = nom;
		this.type = type;
	}
	public Rayon() {
		super();
	}
	@Override
	public String toString() {
		return "Rayon [id=" + id + ", nom=" + nom + ", type=" + type + "]";
	}
	
	
	
}
