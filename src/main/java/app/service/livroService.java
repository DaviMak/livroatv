package app.service;

import java.util.ArrayList;
import java.util.List;

import app.entity.livro;

public class livroService {
	private List<livro> lista = new ArrayList<>();
	
	public String salvar(livro livro) {
		lista.add(livro);
		return "Livro salvo com sucesso";
	}
	public String deletar(livro livro) {
		lista.remove(livro);
		return "Livro deletado com sucesso";
	}
	public String put(livro livro) {
		var index = lista.indexOf(livro);
		this.lista.set(index, livro);
		return "Atualizado com sucesso";
	}
	public List<livro> listAll(){
		return this.lista;
	}
}
