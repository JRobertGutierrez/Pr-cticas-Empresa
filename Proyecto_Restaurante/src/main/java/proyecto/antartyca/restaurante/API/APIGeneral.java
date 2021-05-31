package proyecto.antartyca.restaurante.API;

import java.io.Serializable;
import java.util.List;

public interface APIGeneral<Objeto, ID extends Serializable> {

		Objeto save(Objeto objeto);
		void delete(ID id);
		Objeto find(ID id);
		List<Objeto> getAll();
}
