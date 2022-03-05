package com.jeffraph.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeffraph.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
