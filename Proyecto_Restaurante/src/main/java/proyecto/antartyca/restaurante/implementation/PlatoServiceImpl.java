package proyecto.antartyca.restaurante.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import proyecto.antartyca.restaurante.API.APIGeneralImpl;
import proyecto.antartyca.restaurante.dao.PlatoDao;
import proyecto.antartyca.restaurante.models.PlatoModel;
import proyecto.antartyca.restaurante.service.PlatoService;

@Service
public class PlatoServiceImpl extends APIGeneralImpl<PlatoModel, Integer> implements PlatoService{

	@Autowired
	private PlatoDao platoDao;
	
	@Override
	public CrudRepository<PlatoModel, Integer> getDao() {
		
		return platoDao;
	}

}
