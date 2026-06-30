package actividadesEducativas;
public enum TipoActividades {
    tallerLectura("Taller de lectura"), clubeLibro("Club de libro"), charlas("Charla");
    private String tipo;
    TipoActividades(String tipo){
        this.tipo=tipo;
    }
    public String getTipo() {
        return tipo;
    }
}
