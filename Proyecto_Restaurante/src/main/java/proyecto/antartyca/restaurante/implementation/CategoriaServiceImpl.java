package proyecto.antartyca.restaurante.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import proyecto.antartyca.restaurante.API.APIGeneralImpl;
import proyecto.antartyca.restaurante.dao.CategoriaDao;

import proyecto.antartyca.restaurante.models.CategoriaModel;

import proyecto.antartyca.restaurante.service.CategoriaService;

@Service
public class CategoriaServiceImpl extends APIGeneralImpl<CategoriaModel, Integer> implements CategoriaService{
	@Autowired
	private CategoriaDao categoriaDao;
	
	
	@Override
	public CrudRepository<CategoriaModel, Integer> getDao() {
		
		return categoriaDao;
	}
}
