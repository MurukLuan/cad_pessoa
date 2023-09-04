package br.com.luan.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.luan.model.Endereco;
import br.com.luan.model.Pessoa;
import br.com.luan.model.Telefone;
import br.com.luan.model.TipoTelefone;

@Controller
public class PessoaController {
	
	
	@ResponseBody
	@GetMapping("/pessoas")
	public List<Pessoa> listarPessoa(){
		Endereco endereco = new Endereco("77300-800", "Rua sem saida", "Boa vista");
		List<Telefone> telefones = new ArrayList<>();
		telefones.add(new Telefone("(061)", "98888-5555", TipoTelefone.celular));
		
		Pessoa pessoa = new Pessoa("Luan", "masculino", endereco, telefones );
		
		return Arrays.asList(pessoa, pessoa, pessoa);
	
	}

}
