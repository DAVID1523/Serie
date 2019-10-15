
import java.util.Date;

public class Usuario {

    private String nombre;

    private String apellido;

    private String email;

    private Date fecha_nacimiento;
    
    private Serie serie;
    
      public Usuario(String nombre, String apellido, String email, Date fecha_nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.fecha_nacimiento = fecha_nacimiento;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    
    public void marcar_favorita() {
        
        
    }

    public void mostrar_capitulos() {
    }

    public void criticar_serie() {
    }

    public void criticar_capitulo() {
    }

    public void puntuar_serie() {
    }
}
