package app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import app.entity.livro;
import app.service.livroService;

public class livroController {
	
	private livroService livroService;
	
	@PostMapping("/salvar")
	public ResponseEntity<String> salvar(@RequestBody livro livro){
		try {
			String msg = this.livroService.salvar(livro);
			return new ResponseEntity<String>(msg, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<String>("erro", HttpStatus.BAD_REQUEST);
		}
	}
	public ResponseEntity<String> deletar(@RequestBody livro livro){
		try {
			String msg = this.livroService.deletar(livro);
			return new ResponseEntity<String>(msg, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
	}
	
}
