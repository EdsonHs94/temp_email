package pe.edu.sistemas.microservices.services.web;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("Succes")
public class Succes {
	private String name;
	private String count;
	private String email;
	private String cvv;
	private float monto;
	private String concepts;
	
	public String getConcepts() {
		return concepts;
	}


	public void setConcepts(String concepts) {
		this.concepts = concepts;
	}


	public Succes() {
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public float getMonto() {
		return monto;
	}


	public void setMonto(float monto) {
		this.monto = monto;
	}


	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	
	
	
}
