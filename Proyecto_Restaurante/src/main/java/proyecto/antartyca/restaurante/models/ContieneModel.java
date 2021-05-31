package proyecto.antartyca.restaurante.models;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class ContieneModel {

	@EmbeddedId
	ContieneKeyModel id;
	
	@ManyToOne
	@MapsId("idPlato")
	@JoinColumn(name = "id_plato")
	PlatoModel plato;
	
	@ManyToOne
	@MapsId("idIngrediente")
	@JoinColumn(name = "id_ingrediente")
	IngredienteModel ingrediente;
	
	float cantidad_usada;
	String unid_med;

	public ContieneKeyModel getId() {
		return id;
	}

	public void setId(ContieneKeyModel id) {
		this.id = id;
	}

	public PlatoModel getPlato() {
		return plato;
	}

	public void setPlato(PlatoModel plato) {
		this.plato = plato;
	}

	public IngredienteModel getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(IngredienteModel ingrediente) {
		this.ingrediente = ingrediente;
	}

	public float getCantidad_usada() {
		return cantidad_usada;
	}

	public void setCantidad_usada(float cantidad_usada) {
		this.cantidad_usada = cantidad_usada;
	}

	public String getUnid_med() {
		return unid_med;
	}

	public void setUnid_med(String unid_med) {
		this.unid_med = unid_med;
	}

}
