package com.algaworks.brewer.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.algaworks.brewer.model.Estilo;

@Controller
public class EstilosController {
	
	@RequestMapping("/estilos/novo")
	public String novo(Estilo estilo) {
		return "estilo/CadastroEstilo";
	}

	@RequestMapping(value = "/estilos/novo", method = RequestMethod.POST)
	public String cadastrar(@Valid Estilo estilo, BindingResult result, Model model, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			// O Model deve ser utilizado com o Forward para retornar dados para a view.
			return novo(estilo);
		}

		// Para o Redirect deve ser utilizado o RedirectAttributes para retornar
		// dados para a view.
		attributes.addFlashAttribute("mensagem", "Usuário salvo com sucesso!");
		return "redirect:/estilos/novo";
	}

}
