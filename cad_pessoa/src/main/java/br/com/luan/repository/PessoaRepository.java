package br.com.luan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.luan.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
