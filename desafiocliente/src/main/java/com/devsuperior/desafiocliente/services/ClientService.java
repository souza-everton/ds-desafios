package com.devsuperior.desafiocliente.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.desafiocliente.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
}
