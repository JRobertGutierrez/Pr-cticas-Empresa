package proyecto.antartyca.restaurante.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class PlatoModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7966427088642672452L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PLATO")
	private Integer id;

	@Column(name = "NOMBREPLA")
	private String nombre;

	@Column(name = "DESCRIPCION")
	private String descripcion;

	@Column(name = "NIVEL")
	private Integer nivel;

	@Column(name = "FOTO")
	private String foto;

	@Column(name = "PRECIO")
	private Float precio;

	@ManyToOne
	@JsonIgnoreProperties("platos")
	private CategoriaModel categoria;

	@OneToMany(mappedBy = "plato")
	Set<ContieneModel> contieneModel;
//	@JoinTable(name = "ContieneModel", 
//			joinColumns = @JoinColumn(name = "id_plato", referencedColumnName = "id_plato"),
//			inverseJoinColumns = @JoinColumn(name = "id_ingrediente", referencedColumnName = "id_ingrediente"))
//	@JsonIgnoreProperties("platomodel")
//	@OneToMany
//	private List<IngredienteModel> ingredientes;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public CategoriaModel getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaModel categoria) {
		this.categoria = categoria;
	}

	public Set<ContieneModel> getContieneModel() {
		return contieneModel;
	}

	public void setContieneModel(Set<ContieneModel> contieneModel) {
		this.contieneModel = contieneModel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



}