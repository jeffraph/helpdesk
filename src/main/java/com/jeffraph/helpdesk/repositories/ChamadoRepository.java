package com.jeffraph.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeffraph.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
