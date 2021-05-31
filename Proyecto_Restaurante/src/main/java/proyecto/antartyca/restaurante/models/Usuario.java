package proyecto.antartyca.restaurante.models;

import java.util.Collection;

import javax.persistence.*;



@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idUsuario;
	
	private String nombre;
	private String apellido;
	private String email;
	private String contraseña;
	

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "idUsuario"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "idRol"))
    private Collection<Rol> roles;

}
