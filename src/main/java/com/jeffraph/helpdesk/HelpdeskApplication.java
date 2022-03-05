package com.jeffraph.helpdesk;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jeffraph.helpdesk.domain.Chamado;
import com.jeffraph.helpdesk.domain.Cliente;
import com.jeffraph.helpdesk.domain.Tecnico;
import com.jeffraph.helpdesk.domain.enums.Perfil;
import com.jeffraph.helpdesk.domain.enums.Prioridade;
import com.jeffraph.helpdesk.domain.enums.Status;
import com.jeffraph.helpdesk.repositories.ChamadoRepository;
import com.jeffraph.helpdesk.repositories.ClienteRepository;
import com.jeffraph.helpdesk.repositories.TecnicoRepository;

@SpringBootApplication
public class HelpdeskApplication implements CommandLineRunner {

	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(HelpdeskApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Tecnico tec1 = new Tecnico(null, "Jefferson raph", "41908056100", "jeff@mail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Linus torvalds", "38538246763", "linus@mail.com", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}

}
