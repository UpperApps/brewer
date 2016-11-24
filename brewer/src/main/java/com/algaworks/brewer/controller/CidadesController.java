package com.algaworks.brewer.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.algaworks.brewer.model.Cidade;

@Controller
public class CidadesController {
	
	@RequestMapping("/cidades/novo")
	public String novo(Cidade cidade) {
		return "cidade/CadastroCidade";
	}

	@RequestMapping(value = "/cidades/novo", method = RequestMethod.POST)
	public String cadastrar(@Valid Cidade cidade, BindingResult result, Model model, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			// O Model deve ser utilizado com o Forward para retornar dados para a view.
			return novo(cidade);
		}

		// Para o Redirect deve ser utilizado o RedirectAttributes para retornar
		// dados para a view.
		attributes.addFlashAttribute("mensagem", "Cidade salva com sucesso!");
		return "redirect:/cidades/novo";
	}

}
