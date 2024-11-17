package com.devsupeior.orderCalculator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsupeior.orderCalculator.entities.Order;
import com.devsupeior.orderCalculator.services.OrderService;

@SpringBootApplication
public class OrderCalculatorApplication implements CommandLineRunner{
	
	private OrderService orderService;
	
	public OrderCalculatorApplication(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {
		SpringApplication.run(OrderCalculatorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1309,95.90,00.0);
		Double total = orderService.total(order);
		
		System.out.printf("""
				Pedido código %d
				Valor total %.2f 
				""",order.getCode(),total);
		
	}

}
