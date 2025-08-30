import java.util.ArrayList;

public class Rutina {
    private int idRutina;
    private String nombre;
    private ArrayList<Ejercicio> ejercicios;
    private boolean activa;

    public Rutina(int idRutina, String nombre, boolean activa) {
        this.idRutina = idRutina;
        this.nombre = nombre;
        this.activa = activa;
        this.ejercicios = new ArrayList<>();
    }

    public int getIdRutina() { return idRutina; }
    public void setIdRutina(int idRutina) { this.idRutina = idRutina; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public ArrayList<Ejercicio> getEjercicios() { return ejercicios; }
    public void setEjercicios(ArrayList<Ejercicio> ejercicios) { this.ejercicios = ejercicios; }

    public boolean isActiva() { return activa; }
    public void setActiva(boolean activa) { this.activa = activa; }

    public void agregarEjercicio(Ejercicio e) { ejercicios.add(e); }
}
