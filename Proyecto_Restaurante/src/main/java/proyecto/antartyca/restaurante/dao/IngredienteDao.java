package proyecto.antartyca.restaurante.dao;

import org.springframework.data.repository.CrudRepository;

import proyecto.antartyca.restaurante.models.IngredienteModel;

public interface IngredienteDao extends  CrudRepository<IngredienteModel, Integer> {

}
