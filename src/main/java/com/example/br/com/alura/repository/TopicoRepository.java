package com.example.br.com.alura.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.br.com.alura.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long>{

	List<Topico> findByCursoNome(String nomeCurso);

}
