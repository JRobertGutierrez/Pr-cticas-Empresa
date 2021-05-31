package proyecto.antartyca.restaurante.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import proyecto.antartyca.restaurante.models.CategoriaModel;
import proyecto.antartyca.restaurante.service.CategoriaService;

@Controller
public class CategoriaController {

	private CategoriaService categoriaService;
	@Autowired
	public CategoriaController(CategoriaService categoriaService) {
		this.categoriaService = categoriaService;
	}
	
//	@RequestMapping({ "/", "/index" })
//	public String index(Model model) {
//		model.addAttribute("list", categoriaService.getAll());
//		return "index";
//	}
	
	@GetMapping("/saveCategoria/{id}")
	public String showSave(@PathVariable("id") Integer id, Model model) {
		if (id != null && id != 0) {
			model.addAttribute("categoria", categoriaService.find(id));
		} else {
			model.addAttribute("categoria", new CategoriaModel());
		}
		return "saveCategoria";
	}
	
	@PostMapping("/saveCategoria")
	public String saveCategoria(CategoriaModel categoria, Model model) {
		categoriaService.save(categoria);

		return "redirect:/categoria";
	}

	@GetMapping("/deleteCategoria/{id}")
	public String delete(@PathVariable int id, Model model) {
		categoriaService.delete(id);
		return "redirect:/categoria";
	}
	
	@RequestMapping("/categoria")
	public String categoria(Model model) {
		model.addAttribute("list", categoriaService.getAll());
	    return "categoria";
	}
}
