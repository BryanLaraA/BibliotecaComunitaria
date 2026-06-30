package actividadesEducativas;

import java.util.Arrays;
import java.time.LocalDate;
import java.time.LocalTime;
import usuarios.Usuario;
public class Actividad {
    private TipoActividades actividad;
    private String nombre;
    private LocalDate fecha;
    private LocalTime hora;
    private int capacidad;
    private Usuario usuarios[];

    public Actividad(TipoActividades actividad, String nombre, LocalDate fecha, LocalTime hora, int cupo, Usuario[] usuarios) {
        this.actividad = actividad;
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.capacidad = cupo;
        this.usuarios = usuarios;
    }

    public TipoActividades getActividad() {
        return actividad;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public void setNombre(String nombre) {
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public void setUsuarios(Usuario[] usuarios) {
        this.usuarios = usuarios;
    }
    public void addUsuarios(Usuario usuario){
        int i = buscarVacio();
        
        if(i==-1){
            System.out.println("No queda espacio");
        }
        else{
            this.usuarios[i]=usuario;
            System.out.println("Usuario añadido");
        }
    }
    public int buscarVacio(){
        int i = 0;
        for (i=0;i<usuarios.length;i++){
            if(usuarios[i]==null){
                return i;
            }
        }
        return -1;
    }
    public boolean someUsuario(Usuario usuario){
        int i = 0;
        for (i=0;i<usuarios.length;i++){
            if(this.usuarios[i]==usuario){
                return true;
            }
        }
        return false;
    }
}
