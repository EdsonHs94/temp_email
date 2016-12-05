package pe.edu.sistemas.microservices.visa;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Service;
import org.apache.http.client.methods.CloseableHttpResponse;

import java.util.HashMap;

import org.apache.http.HttpStatus;





@RestController
@RequestMapping("/api") 
public class VisaController {
	
	
	@Autowired
	VisaService v;
	
	@RequestMapping("/all") 
	public String api(){
		
	return v.sayHi();
		
	}
	


	
}
