package pe.edu.sistemas.microservices.services.web;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("monto")
public class ReturnMonto {
	
	private float total;
	private String concepts;
	
	
	
	public String getConcepts() {
		return concepts;
	}



	public void setConcepts(String concepts) {
		this.concepts = concepts;
	}



	public ReturnMonto() {
		
	}



	public float getTotal() {
		return total;
	}



	public void setTotal(float total) {
		this.total = total;
	}

	

}
