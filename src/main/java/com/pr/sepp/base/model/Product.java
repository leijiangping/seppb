package com.pr.sepp.base.model;

import lombok.Data;

@Data
public class Product {
	private Integer productId;
	private Integer owner;
	private String productCode;
	private String productName;
	private String productDesc;
	private String isValid;
}
