package com.alvaro.retonapptilus;
import java.net.InetAddress;
/*********************
*
*
* Clase de tests ,, 
*   Se testean los
* 
* 
* (Alvaro B.S. octubre 2022)
*
*
*/
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Instant;

import javax.annotation.PostConstruct;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.alvaro.retonapptilus.service.EntryParamsDto;
import com.alvaro.retonapptilus.service.ReturnParamsDto;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
class RetoNapptilusApplicationTests {
	
	@Autowired
	private TestRestTemplate restTemplate;

//	@Value("${server.host}")
//	private String host;
//	
//	@Value("${server.port}")
//	private int port;
//	
	final String  url="http://localhost:8080/prices?instante={instante}&productId={productId}&brandId={brandId}";

	@Test
	void testPeticion01() throws URISyntaxException  {
						
		//InetAddress.getLocalHost();
		
		//HttpEntity<EntryParamsDto> request = new HttpEntity<>(entryP);		
        ResponseEntity<ReturnParamsDto> result = this.restTemplate.getForEntity(url, ReturnParamsDto.class, 
        		"2020-06-14T10:00:00.00Z",
        		35455,
        		1);
        Assert.assertEquals(200, result.getStatusCodeValue());
        Assert.assertEquals( (Long) Long.parseLong("1") ,result.getBody().getBrandId());
        Assert.assertEquals( Instant.parse("2020-06-14T00:00:00Z") ,result.getBody().getStartDate());
        Assert.assertEquals( Instant.parse("2020-12-31T23:59:59.900Z") ,result.getBody().getEndDate());
        Assert.assertEquals( (Long) Long.parseLong("1") ,result.getBody().getPriceList());
        Assert.assertEquals( (Long) Long.parseLong("35455") ,result.getBody().getProductId());
        Assert.assertEquals( (Double) Double.parseDouble("35.5") ,result.getBody().getPrice());
	}
 	@Test
	void testPeticion02() throws URISyntaxException  {
        ResponseEntity<ReturnParamsDto> result = this.restTemplate.getForEntity(url, ReturnParamsDto.class, 
        		"2020-06-14T16:00:00.00Z",
        		35455,
        		1);
		Assert.assertEquals(200, result.getStatusCodeValue());
		Assert.assertEquals( (Long) Long.parseLong("1") ,result.getBody().getBrandId());
		Assert.assertEquals( Instant.parse("2020-06-14T15:00:00Z") ,result.getBody().getStartDate());
		Assert.assertEquals( Instant.parse("2020-06-14T18:30:00Z") ,result.getBody().getEndDate());
		Assert.assertEquals( (Long) Long.parseLong("2") ,result.getBody().getPriceList());
		Assert.assertEquals( (Long) Long.parseLong("35455") ,result.getBody().getProductId());
		Assert.assertEquals( (Double) Double.parseDouble("25.45") ,result.getBody().getPrice()); 		
 	}

	@Test
	void testPeticion03() throws URISyntaxException  {
        ResponseEntity<ReturnParamsDto> result = this.restTemplate.getForEntity(url, ReturnParamsDto.class, 
        		"2020-06-14T21:00:00.00Z",
        		35455,
        		1);
		Assert.assertEquals(200, result.getStatusCodeValue());
		Assert.assertEquals( (Long) Long.parseLong("1") ,result.getBody().getBrandId());
		Assert.assertEquals( Instant.parse("2020-06-14T00:00:00Z") ,result.getBody().getStartDate());
		Assert.assertEquals( Instant.parse("2020-12-31T23:59:59.900Z") ,result.getBody().getEndDate());
		Assert.assertEquals( (Long) Long.parseLong("1") ,result.getBody().getPriceList());
		Assert.assertEquals( (Long) Long.parseLong("35455") ,result.getBody().getProductId());
		Assert.assertEquals( (Double) Double.parseDouble("35.5") ,result.getBody().getPrice());
	}
	@Test
	void testPeticion04() throws URISyntaxException  {
        ResponseEntity<ReturnParamsDto> result = this.restTemplate.getForEntity(url, ReturnParamsDto.class, 
        		"2020-06-15T10:00:00.00Z",
        		35455,
        		1);
		Assert.assertEquals(200, result.getStatusCodeValue());
		Assert.assertEquals( (Long) Long.parseLong("1") ,result.getBody().getBrandId());
		Assert.assertEquals( Instant.parse("2020-06-15T00:00:00Z") ,result.getBody().getStartDate());
		Assert.assertEquals( Instant.parse("2020-06-15T11:00:00.0Z") ,result.getBody().getEndDate());
		Assert.assertEquals( (Long) Long.parseLong("3") ,result.getBody().getPriceList());
		Assert.assertEquals( (Long) Long.parseLong("35455") ,result.getBody().getProductId());
		Assert.assertEquals( (Double) Double.parseDouble("30.5") ,result.getBody().getPrice());
	}
	@Test
	void testPeticion05() throws URISyntaxException  {
        ResponseEntity<ReturnParamsDto> result = this.restTemplate.getForEntity(url, ReturnParamsDto.class, 
        		"2020-06-16T21:00:00.00Z",
        		35455,
        		1);
		Assert.assertEquals(200, result.getStatusCodeValue());
		Assert.assertEquals( (Long) Long.parseLong("1") ,result.getBody().getBrandId());
		Assert.assertEquals( Instant.parse("2020-06-15T16:00:00Z") ,result.getBody().getStartDate());
		Assert.assertEquals( Instant.parse("2020-12-31T23:59:59.900Z") ,result.getBody().getEndDate());
		Assert.assertEquals( (Long) Long.parseLong("4") ,result.getBody().getPriceList());
		Assert.assertEquals( (Long) Long.parseLong("35455") ,result.getBody().getProductId());
		Assert.assertEquals( (Double) Double.parseDouble("38.95") ,result.getBody().getPrice());	
	}
//	@Test
//	void testPeticion06() throws URISyntaxException  {
//		
//		URI uri = new URI("http://localhost:"+randomServerPort+"/prices");
//		
//		EntryParamsDto entryP = new EntryParamsDto(
//				Instant.parse("20-01-01 10:00:00.0"),
//				Long.valueOf(35455),
//				Long.valueOf(1));
//		
//		HttpEntity<EntryParamsDto> request = new HttpEntity<>(entryP);		
//        ResponseEntity<String> result = this.restTemplate.postForEntity(uri, request, String.class);
//        Assert.assertEquals(200, result.getStatusCodeValue());
//	}	
}
