package br.com.luan.model;

import java.util.Objects;

public class Endereco {
	
	private Long id;
	private String cep;
	private String logradouro;
	private String bairro;
	private String cidade;
	private String complemento;
	
	private Pessoa pessoa;

	public Endereco(String cep, String logradouro, String bairro) {
		super();
		this.cep = cep;
		this.logradouro = logradouro;
		this.bairro = bairro;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(bairro, cep, cidade, complemento, id, logradouro, pessoa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		return Objects.equals(bairro, other.bairro) && Objects.equals(cep, other.cep)
				&& Objects.equals(cidade, other.cidade) && Objects.equals(complemento, other.complemento)
				&& Objects.equals(id, other.id) && Objects.equals(logradouro, other.logradouro)
				&& Objects.equals(pessoa, other.pessoa);
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
	
	

}
