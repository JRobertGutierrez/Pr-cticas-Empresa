package proyecto.antartyca.restaurante.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ContieneKeyModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -520891155334126745L;

	@Column (name = "id_plato")
	int idPlato;
	
	@Column (name = "id_ingrediente")
	int idIngrediente;

	public int getIdPlato() {
		return idPlato;
	}

	public void setIdPlato(int idPlato) {
		this.idPlato = idPlato;
	}

	public int getIdIngrediente() {
		return idIngrediente;
	}

	public void setIdIngrediente(int idIngrediente) {
		this.idIngrediente = idIngrediente;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
