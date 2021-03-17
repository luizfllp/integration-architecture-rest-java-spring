package com.luizantunes.demo.acme.ap.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizantunes.demo.acme.ap.domain.Cliente;



public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	public Optional<Cliente> findByCpf(String cpf);
	
}