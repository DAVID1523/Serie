public class Capitulo {

    private String titulo;

    private float duracion;

    private String sinopsis;

    private boolean estado;
    
    private Temporada temporada;

    public Capitulo(String titulo, float duracion, String sinopsis, boolean estado) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.sinopsis = sinopsis;
        this.estado = estado;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public boolean setEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }



}

