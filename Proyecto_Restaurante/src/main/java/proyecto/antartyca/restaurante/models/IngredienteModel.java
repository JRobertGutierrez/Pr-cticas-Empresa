package proyecto.antartyca.restaurante.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;

@Entity
public class IngredienteModel {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_INGREDIENTE")
	private Integer id;
	
	@Column(name = "NOMBRE_ING")
	private String nombre_ing;
	
	@Column(name = "UNIDAD_MED")
	private String unidad_med;

	@Column(name= "STOCK_ALMACEN")
	private Float stock_almacen;
	
//	@ManyToMany(mappedBy = "ingredientes")
//	@JsonIgnoreProperties("ingredientes")
//    private List<PlatoModel> plato;
	
	@OneToMany(mappedBy = "ingrediente")
	Set<ContieneModel> contieneModel;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre_ing() {
		return nombre_ing;
	}

	public void setNombre_ing(String nombre_ing) {
		this.nombre_ing = nombre_ing;
	}

	public String getUnidad_med() {
		return unidad_med;
	}

	public void setUnidad_med(String unidad_med) {
		this.unidad_med = unidad_med;
	}

	public Float getStock_almacen() {
		return stock_almacen;
	}

	public void setStock_almacen(Float stock_almacen) {
		this.stock_almacen = stock_almacen;
	}

	public Set<ContieneModel> getContieneModel() {
		return contieneModel;
	}

	public void setContieneModel(Set<ContieneModel> contieneModel) {
		this.contieneModel = contieneModel;
	}

}
