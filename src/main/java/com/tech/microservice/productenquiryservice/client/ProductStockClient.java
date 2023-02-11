package com.tech.microservice.productenquiryservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.tech.microservice.productenquiryservice.bean.ProductEnquiryBean;
//@FeignClient(name="tech-product-stock-service",url = "localhost:8808")
@FeignClient(name ="tech-product-stock-service")
public interface ProductStockClient {
	
	@GetMapping("/check-product-stock/productName/{productName}/ProductAvailability/{productAvailability}")
	public ProductEnquiryBean checkProductAvailabilty(@PathVariable String productName,@PathVariable String productAvailability) throws Exception; 

}
