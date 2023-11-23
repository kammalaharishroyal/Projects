package l12_hibernate_mappings.one2oneAnnotation;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="customer_o2o_annotation")
public class Customer {
	
	@Id
	@Column(name="id")
	@GeneratedValue
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="adress")
	private String adress;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private CustomerTransaction transaction;
	
	public CustomerTransaction getTransaction() {
		return transaction;
	}
	public void setTransaction(CustomerTransaction transaction) {
		this.transaction = transaction;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	public Customer(int id, String name, String email, String adress, CustomerTransaction transaction) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.adress = adress;
		this.transaction = transaction;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", adress=" + adress + ", transaction="
				+ transaction + "]";
	}
	
	
	
}
