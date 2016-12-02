package pe.edu.sistemas.microservices.services.web;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("Succes")
public class Succes {
	String name;
	String count;
	String email;
	String cvv;
	
	
	public Succes(String name, String count, String email, String cvv) {
		this.name = name;
		this.count = count;
		this.email = email;
		this.cvv = cvv;
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