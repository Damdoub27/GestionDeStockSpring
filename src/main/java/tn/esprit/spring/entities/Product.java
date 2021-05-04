package tn.esprit.spring.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T_Product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Product_id")
	private Long id;
	private String nom;
	private float price;
	private String image;
	private int quantity;
	@Enumerated(EnumType.STRING)
	private TypeProduct type;
	@ManyToOne
	private Category category;
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public TypeProduct getType() {
		return type;
	}
	public void setType(TypeProduct type) {
		this.type = type;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Product(Long id, String nom, float price, String image, int quantity, TypeProduct type, Category category) {
		super();
		this.id = id;
		this.nom = nom;
		this.price = price;
		this.image = image;
		this.quantity = quantity;
		this.type = type;
		this.category = category;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", nom=" + nom + ", price=" + price + ", image=" + image + ", quantity=" + quantity
				+ ", type=" + type + ", category=" + category + "]";
	}
	
	
	
	
	
	
}
