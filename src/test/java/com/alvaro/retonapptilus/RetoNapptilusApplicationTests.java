package com.alvaro.retonapptilus;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Timestamp;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.util.LinkedMultiValueMap;

import com.alvaro.retonapptilus.controller.PricesController;
import com.alvaro.retonapptilus.service.EntryParamsService;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
class RetoNapptilusApplicationTests {
	
	@Autowired
	private TestRestTemplate restTemplate;

	@LocalServerPort
    int randomServerPort;
 
	@Test
	void testPeticion01() throws URISyntaxException  {
		
		URI uri = new URI("http://localhost:"+randomServerPort+"/prices");
		
		EntryParamsService entryP = new EntryParamsService(
				Timestamp.valueOf("2020-06-14 16:02:03.0"),
				Long.valueOf(35455),
				Long.valueOf(1));
		
		HttpEntity<EntryParamsService> request = new HttpEntity<>(entryP);
		
        ResponseEntity<String> result = this.restTemplate.postForEntity(uri, request, String.class);

        Assert.assertEquals(201, result.getStatusCodeValue());

        
//		LinkedMultiValueMap<String, String> requestParams = new LinkedMultiValueMap<>();
//				requestParams.add("id", "1");
//				requestParams.add("name", "john");
//				requestParams.add("age", "30");

//		mockMvc.perform(MockMvcRequestBuilders
//				.post("/prices")
//				.params(requestParams))
//				.andExpect(MockMvcResultMatchers.jsonPath("$.firstName").value("firstName2"));
		
		
	}
}
