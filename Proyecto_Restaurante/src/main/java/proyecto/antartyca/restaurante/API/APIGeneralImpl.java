package proyecto.antartyca.restaurante.API;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public abstract class APIGeneralImpl<Objeto, ID extends Serializable> implements APIGeneral<Objeto, ID> {

	
	@Override
	public void delete(ID id) {
		getDao().deleteById(id);
	}
	
	@Override
	public List<Objeto> getAll() {
		List<Objeto> listaObjetos = new ArrayList<>();
		getDao().findAll().forEach(objeto -> listaObjetos.add(objeto));
		
		return listaObjetos;
	}
	
	@Override
	public Objeto find(ID id) {
		Optional<Objeto> objeto = getDao().findById(id);
		if(objeto.isPresent()) {
			return objeto.get();
		}
		return null;
	}
	
	@Override
	public Objeto save(Objeto objeto) {
		return getDao().save(objeto);
	}
	
	public abstract CrudRepository<Objeto, ID> getDao();
}
