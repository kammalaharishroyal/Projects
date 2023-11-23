package com.harish.productservice;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.harish.productservice.dto.ProductRequest;

@SpringBootTest
@Testcontainers
@AutoConfigureMockMvc
class ProductServiceApplicationTests {
		
	@Container
	static MongoDBContainer mongo=new MongoDBContainer("mongo:7.0.0");
	
	@Autowired
	private MockMvc mockmvc;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@DynamicPropertySource
	static void setProperties(DynamicPropertyRegistry dym) {
		dym.add("spring.data.mongodb.uri", mongo::getReplicaSetUrl);
	}
	@Test
	void shouldCreateProduct() throws Exception {
		ProductRequest prq=getProductRequest();
		String prqstring=objectMapper.writeValueAsString(prq);
		mockmvc.perform(MockMvcRequestBuilders.post("/api/product")
				.contentType(MediaType.APPLICATION_JSON).content(prqstring)
				).andExpect(status().isCreated());
		
		
	}
	private ProductRequest getProductRequest() {
		// TODO Auto-generated method stub
		ProductRequest pr=new ProductRequest();
		pr.setName("oppo");
		pr.setDesc("oppo smart phone");
		pr.setPrice(BigDecimal.valueOf(20000));
		return pr;
		
	}

}
