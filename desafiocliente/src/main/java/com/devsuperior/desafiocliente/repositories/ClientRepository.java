package com.devsuperior.desafiocliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.desafiocliente.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
