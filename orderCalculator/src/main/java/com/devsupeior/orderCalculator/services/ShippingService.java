package com.devsupeior.orderCalculator.services;

import org.springframework.stereotype.Service;

import com.devsupeior.orderCalculator.entities.Order;

@Service
public class ShippingService {

	public Double shipment(Order order) {
		Double valorFrete;
		if (order.getBasicValue() < 100) {
			valorFrete = 20.0;
		} else if (order.getBasicValue() < 200) {
			valorFrete = 12.0;
		} else {
			valorFrete = 0.0;
		}
		return valorFrete;
	}
}
