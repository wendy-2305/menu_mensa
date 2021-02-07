package entit.ten;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Menu {
	
	 public Menu(Long id, String name, String beschreibung, double price) {
			
			this.id = id;
			this.name = name;
			this.beschreibung=beschreibung;
			this.price=price;
		}
	 
	 public Menu() {
			super();
		}

  @Id 
  Long id;


String name;
  String beschreibung;
  double price;
public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBeschreibung() {
	return beschreibung;
}
public void setBeschreibung(String beschreibung) {
	this.beschreibung = beschreibung;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

  @Override
  public String toString() {
	return "Menu [id=" + id + ", name=" + name + ", beschreibung=" + beschreibung + ", price=" + price + "]";
}
}