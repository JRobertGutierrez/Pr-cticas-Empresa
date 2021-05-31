package proyecto.antartyca.restaurante.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import proyecto.antartyca.restaurante.API.APIGeneralImpl;
import proyecto.antartyca.restaurante.dao.IngredienteDao;
import proyecto.antartyca.restaurante.dao.PlatoDao;
import proyecto.antartyca.restaurante.models.IngredienteModel;
import proyecto.antartyca.restaurante.models.PlatoModel;
import proyecto.antartyca.restaurante.service.IngredienteService;

@Service
public class IngredienteServiceImpl extends APIGeneralImpl<IngredienteModel, Integer> implements IngredienteService {

	@Autowired
	private IngredienteDao ingredienteDao;
	
	
	@Override
	public CrudRepository<IngredienteModel, Integer> getDao() {
		
		return ingredienteDao;
	}
}
