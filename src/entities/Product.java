package entities;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "product")
public class Product {
   
	private String id;
	private String name;
	private double price;
	private int quantity;
	
	@XmlElement(name="id")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@XmlElement(name="name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElement(name="price")
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@XmlElement(name="quantity")
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Product(String string, String string2, int i, int j) {
		super();
	}
	
}
