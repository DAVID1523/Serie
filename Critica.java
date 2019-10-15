import java.util.Date;

public class Critica {

    private Date fecha;

    private String comentario;
    
    private Serie serie;
    
    private Usuario usuario;
    
     public Critica(Date fecha, String comentario) {
        this.fecha = fecha;
        this.comentario = comentario;
    }
    
    public Date getFecha(){
    
        return fecha;
    }
    
    public String getComentario(){
    return comentario;
    
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
}
