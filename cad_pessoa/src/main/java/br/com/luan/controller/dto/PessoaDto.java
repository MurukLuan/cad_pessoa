package br.com.luan.controller.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import br.com.luan.model.Endereco;
import br.com.luan.model.Pessoa;
import br.com.luan.model.Telefone;

public class PessoaDto {
	
	private Long id;
	private String nome;
	private Date dataNascimento;
	private String genero;
	
	private Endereco endereco;
	private List<Telefone> telefones = new ArrayList<>();
	
	
	
	public PessoaDto(Pessoa pessoa) {
		super();
		this.id = pessoa.getId();
		this.nome = pessoa.getNome();
		this.dataNascimento = pessoa.getDataNascimento();
		this.genero = pessoa.getGenero();
		this.endereco = pessoa.getEndereco();
		this.telefones = pessoa.getTelefones();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public List<Telefone> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	
	
	public static List<PessoaDto> convertePessoa(List<Pessoa> pessoas){
		return pessoas.stream().map(PessoaDto::new).collect(Collectors.toList());
	}
	
}
