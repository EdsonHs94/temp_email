package pe.edu.sistemas.microservices.visa;

import org.springframework.stereotype.Service;
import org.apache.http.client.methods.CloseableHttpResponse;

import java.util.HashMap;
import org.apache.http.HttpStatus;



@Service
public class VisaService {
	String apiKey = VisaProperties.getProperty(Property.API_KEY);
	VisaAPIClient visaAPIClient = null;	
	String paymentAuthorizationRequest  = "{\"amount\": \"0\","
               + "\"currency\": \"USD\","
               + "\"payment\": {"
                   + "\"cardNumber\": \"4111111111111111\","
                    + "\"cardExpirationMonth\": \"12\","
                   + "\"cardExpirationYear\": \"2016\""
                   + "}"
               + "}";
	
//	public VisaService(){
//		String apiKey  = VisaProperties.getProperty(Property.API_KEY);
//	    VisaAPIClient visaAPIClient = new VisaAPIClient();
//	    String paymentAuthorizationRequest  = 
//                "{\"amount\": \"0\","
//   	                 + "\"currency\": \"USD\","
//   	                 + "\"payment\": {"
//   	                     + "\"cardNumber\": \"4111111111111111\","
//   	                     + "\"cardExpirationMonth\": \"12\","
//   	                     + "\"cardExpirationYear\": \"2016\""
//   	                     + "}"
//   	                 + "}"; 
//		
//	}
	
//	public String metodo(){
//		
//		String baseUri = "cybersource/";
//        String resourcePath = "payments/v1/authorizations";
//        String queryString = "apikey=" + apiKey;
//
//        try {
//			CloseableHttpResponse response = this.visaAPIClient.doXPayTokenRequest(baseUri, resourcePath, queryString, "Payment Authorization Test", this.paymentAuthorizationRequest, MethodTypes.POST, new HashMap<String, String>());
//			return response.toString();
//        } catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        
//        return "";
//	}
//	
	public String sayHi(){
		return apiKey;
	}
}
