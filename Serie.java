


public class Serie {

    private String Titulo;

    private int fecha_estreno;
   
    private String genero;

    private String personajes;

    private String sinopsis;

    private boolean estado;

   
    
    private Usuario usuario;
    
    private Actor actor;
    
    private Personaje personaje;

    //metodos
    
    public Serie(){
    
    
    }
    public Serie(String Titulo, int fecha_estreno, String genero,Personaje personaje, String sinopsis, boolean estado) {
        this.Titulo = Titulo;
        this.fecha_estreno = fecha_estreno;
        this.genero = genero;
        this.personaje = personaje;
        this.sinopsis = sinopsis;
        this.estado = estado;
       
        this.usuario = usuario;
        this.actor= actor;
        
    }

    
    public String getTitulo() {
        return Titulo;
    }

    public int getFecha_estreno() {
        return fecha_estreno;
    }

    public String getGenero() {
        return genero;
    }

    public Personaje getPersonaje() {
        return personaje;
    }
    
    

    public boolean isEstado() {
        return estado;
    }

    

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setFecha_estreno(int fecha_estreno) {
        this.fecha_estreno = fecha_estreno;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPersonaje(Personaje  personaje) {
        this.personaje = personaje;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

   
    
}
