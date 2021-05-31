package proyecto.antartyca.restaurante.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import proyecto.antartyca.restaurante.models.IngredienteModel;
import proyecto.antartyca.restaurante.service.IngredienteService;

@Controller
public class IngredienteController {

	private IngredienteService ingredienteService;
	@Autowired
	public IngredienteController(IngredienteService ingredienteService) {
		this.ingredienteService = ingredienteService;
	}
	
	@GetMapping("/saveIngrediente/{id}")
	public String showSave(@PathVariable("id") Integer id, Model model) {
		if (id != null && id != 0) {
			model.addAttribute("ingrediente", ingredienteService.find(id));
		} else {
			model.addAttribute("ingrediente", new IngredienteModel());
		}
		return "saveIngrediente";
	}
	
	@PostMapping("/saveIngrediente")
	public String saveIngrediente(IngredienteModel ingrediente, Model model) {
		ingredienteService.save(ingrediente);

		return "redirect:/ingrediente";
	}
	
	@GetMapping("/deleteIngrediente/{id}")
	public String delete(@PathVariable int id, Model model) {
		ingredienteService.delete(id);
		return "redirect:/ingrediente";
	}
	
	@RequestMapping("/ingrediente")
	public String ingrediente(Model model) {
		model.addAttribute("list", ingredienteService.getAll());
	    return "ingrediente";
	}
	
}
