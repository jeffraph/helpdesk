package com.jeffraph.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeffraph.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}