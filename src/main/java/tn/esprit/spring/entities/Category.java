package tn.esprit.spring.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "T_Category")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Category_id")
	private Long id;
	private String nom;
	
	@OneToMany
	private Product product;

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

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Category(Long id, String nom, Product product) {
		super();
		this.id = id;
		this.nom = nom;
		this.product = product;
	}

	public Category() {
		super();
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", nom=" + nom + ", product=" + product + "]";
	}
	

	
}
