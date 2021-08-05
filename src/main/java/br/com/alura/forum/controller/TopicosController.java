package br.com.alura.forum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.TopicoRepository;

@RestController//essa anotação indica que por padrão todos os métodos da classe terão um @ResponseBody, indica ao Spring que o retorno do método deve ser devolvido como resposta (exibe no browser)
public class TopicosController {
	
	@Autowired//injeção de dependência
	private TopicoRepository topicoRepository;
	
	@RequestMapping("/topicos")//ao digitar o endereço o método é chamado
	public List<TopicoDto> lista(String nomeCurso) {
		if (nomeCurso == null) {
			List<Topico> topicos = topicoRepository.findAll();
			return TopicoDto.converter(topicos);
		} else {
			List<Topico> topicos = topicoRepository.findByCursoNome(nomeCurso);
			return TopicoDto.converter(topicos);
		}
	}

}
