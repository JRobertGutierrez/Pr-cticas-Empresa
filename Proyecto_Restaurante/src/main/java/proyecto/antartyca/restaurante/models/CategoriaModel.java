package proyecto.antartyca.restaurante.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class CategoriaModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3961250782946323064L;

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_CATEGORIA")
	private Integer id;
	
	@Column(name = "NOMBRECAT")
	private String nombreCat;
	
	@Column(name = "DESCRIPCION")
	private String descripcion;
	
	@Column(name = "NOMBREENC")
	private String nombreEnc;
	
	@OneToMany(mappedBy = "categoria") 
	@JsonIgnoreProperties("categoria")
    private List<PlatoModel> platos;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreCat() {
		return nombreCat;
	}

	public void setNombreCat(String nombreCat) {
		this.nombreCat = nombreCat;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombreEnc() {
		return nombreEnc;
	}

	public void setNombreEnc(String nombreEnc) {
		this.nombreEnc = nombreEnc;
	}

	public List<PlatoModel> getPlatos() {
		return platos;
	}

	public void setPlatos(List<PlatoModel> platos) {
		this.platos = platos;
	}

}