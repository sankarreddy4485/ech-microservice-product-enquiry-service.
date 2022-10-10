package com.tech.microservice.productenquiryservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tech.microservice.productenquiryservice.bean.ProductEnquiryBean;
import com.tech.microservice.productenquiryservice.client.ProductStockClient;

@RestController
public class ProductEnquiryContoller {
	
	@Autowired
	ProductStockClient productStockClient;
	@Autowired
	Environment environment;
	
	@GetMapping("/product-enquiry/name/{name}/availability/{availability}/unit/{unit}")
	public ProductEnquiryBean getEnquiryOfProduct(@PathVariable String name,@PathVariable String availability,@PathVariable int unit) {
		
		
		ProductEnquiryBean productEnquiryBean =productStockClient.checkProductAvailabilty(name, availability);
		double totalPrice=productEnquiryBean.getProductPrice().doubleValue()*unit;
		double discount= productEnquiryBean.getDiscountOffer();
		double discountPrice =totalPrice-totalPrice*discount/100;
		
		return new ProductEnquiryBean(productEnquiryBean.getId(), name, productEnquiryBean.getProductPrice(), availability, productEnquiryBean.getDiscountOffer(), unit, discountPrice, productEnquiryBean.getPort());
		
	}

}
