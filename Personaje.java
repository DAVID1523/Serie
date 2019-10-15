public class Personaje {

    private String nombre_artistico;

    private int codigo;
    
   
    
    
    
    
    
    public Personaje(String nombre_artistico, int codigo) {
        this.nombre_artistico = nombre_artistico;
        this.codigo = codigo;
    }
    
    
    
    public String getNombre_artistico(){
    
    return nombre_artistico;
    }
    
    public int getCodigo(){
    
    return codigo;
    }

    public void setNombre_artistico(String nombre_artistico) {
        this.nombre_artistico = nombre_artistico;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
}
