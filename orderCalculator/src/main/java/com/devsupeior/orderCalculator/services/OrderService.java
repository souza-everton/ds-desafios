package com.devsupeior.orderCalculator.services;

import org.springframework.stereotype.Service;

import com.devsupeior.orderCalculator.entities.Order;

@Service
public class OrderService {

	private ShippingService shippingService;

	public OrderService(ShippingService shippingService) {
		this.shippingService = shippingService;
	}

	public Double total(Order order) {
		Double discount = order.getBasicValue() * (order.getDiscount() / 100);
		Double total = order.getBasicValue() + shippingService.shipment(order) - discount;
		return total;
	}
}
