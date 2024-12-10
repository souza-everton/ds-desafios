package com.devsuperior.desafiocliente.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.PastOrPresent;

@Entity
@Table(name = "tb_client")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String name;
	@Column(unique = true, nullable = false)
	private String cpf;
	@Column(nullable = false)
	private Double income;
	@Column(nullable = false)
	@PastOrPresent
	private LocalDate birthData;
	@Column(nullable = false)
	private Integer children;
	
	public Client() {
		
	}

	public Client(Long id, String name, String cpf, Double income, LocalDate birthData, Integer children) {
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.income = income;
		this.birthData = birthData;
		this.children = children;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}

	public LocalDate getBirthData() {
		return birthData;
	}

	public void setBirthData(LocalDate birthData) {
		this.birthData = birthData;
	}

	public Integer getChildren() {
		return children;
	}

	public void setChildren(Integer children) {
		this.children = children;
	}
	
}
