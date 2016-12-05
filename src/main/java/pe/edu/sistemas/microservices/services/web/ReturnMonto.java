package pe.edu.sistemas.microservices.services.web;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("monto")
public class ReturnMonto {
	
	private float total;
	
	
	
	public ReturnMonto() {
		
	}



	public float getTotal() {
		return total;
	}



	public void setTotal(float total) {
		this.total = total;
	}

	

}
