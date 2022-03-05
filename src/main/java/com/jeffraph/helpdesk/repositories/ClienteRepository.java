package com.jeffraph.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeffraph.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
