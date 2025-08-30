import java.util.ArrayList;

public class Entrenador {
    private int idEntrenador;
    private String nombre;
    private String especialidad;
    private ArrayList<Miembro> miembros;

    public Entrenador(int idEntrenador, String nombre, String especialidad) {
        this.idEntrenador = idEntrenador;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.miembros = new ArrayList<>();
    }

    public int getIdEntrenador() { return idEntrenador; }
    public void setIdEntrenador(int idEntrenador) { this.idEntrenador = idEntrenador; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    public ArrayList<Miembro> getMiembros() { return miembros; }
    public void setMiembros(ArrayList<Miembro> miembros) { this.miembros = miembros; }

    public void agregarMiembro(Miembro m) { miembros.add(m); }
}
