import java.util.Date;


public class Temporada {

    private String fecha_produccion;

   

    private String fecha_estreno;

    private String estado;
    private Serie serie;

    
    
    
    //metodos

    public Temporada(String fecha_produccion, String fecha_estreno, String estado, Serie serie) {
        this.fecha_produccion = fecha_produccion;
        this.fecha_estreno = fecha_estreno;
        this.estado = estado;
        this.serie=serie;
       
    }
    
    
     public String getFecha_produccion() {
        return fecha_produccion;
    }

    public String   getFecha_estreno() {
        return fecha_estreno;
    }

    public String getEstado() {
        return estado;
    }

   

    public void setFecha_produccion(String fecha_produccion) {
        this.fecha_produccion = fecha_produccion;
    }

    public void setFecha_estreno(String fecha_estreno) {
        this.fecha_estreno = fecha_estreno;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    
}
