package com.example.catalogservice.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class CatalogDto implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 8216211942010367481L;

	private String productId;
	private Integer qty;
	private Integer unitPrice;
	private Integer totalPrice;

	private String orderId;
	private String userId;
}
