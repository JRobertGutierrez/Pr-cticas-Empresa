package proyecto.antartyca.restaurante.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import proyecto.antartyca.restaurante.models.PlatoModel;
import proyecto.antartyca.restaurante.service.PlatoService;

@Controller
public class PlatoController {

	private PlatoService platoService;
	@Autowired
	public PlatoController(PlatoService platoService) {
		this.platoService = platoService;
	}
	
	@RequestMapping({ "/", "/index" })
	public String index(Model model) {
		model.addAttribute("list", platoService.getAll());
		return "index";
	}

	@GetMapping("/savePlato/{id}")
	public String showSave(@PathVariable("id") Integer id, Model model) {
		if (id != null && id != 0) {
			model.addAttribute("plato", platoService.find(id));
		} else {
			model.addAttribute("plato", new PlatoModel());
		}
		return "savePlato";
	}

	@PostMapping("/savePlato")
	public String savePlato(PlatoModel plato, Model model) {
		platoService.save(plato);

		return "redirect:/plato";
	}

	@GetMapping("/deletePlato/{id}")
	public String delete(@PathVariable int id, Model model) {
		platoService.delete(id);
		return "redirect:/plato";
	}
	
	@RequestMapping("/plato")
	public String plato(Model model) {
		model.addAttribute("list", platoService.getAll());
	    return "plato";
	}
}
