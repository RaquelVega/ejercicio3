import java.util.ArrayList;

public class Miembro {
    private int idMiembro;
    private String nombre;
    private int edad;
    private String tipoMembresia;
    private ArrayList<Rutina> rutinas;
    private Entrenador entrenador;

    public Miembro(int idMiembro, String nombre, int edad, String tipoMembresia, Entrenador entrenador) {
        this.idMiembro = idMiembro;
        this.nombre = nombre;
        this.edad = edad;
        this.tipoMembresia = tipoMembresia;
        this.entrenador = entrenador;
        this.rutinas = new ArrayList<>();
    }

    public int getIdMiembro() { return idMiembro; }
    public void setIdMiembro(int idMiembro) { this.idMiembro = idMiembro; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getTipoMembresia() { return tipoMembresia; }
    public void setTipoMembresia(String tipoMembresia) { this.tipoMembresia = tipoMembresia; }

    public ArrayList<Rutina> getRutinas() { return rutinas; }
    public void setRutinas(ArrayList<Rutina> rutinas) { this.rutinas = rutinas; }

    public Entrenador getEntrenador() { return entrenador; }
    public void setEntrenador(Entrenador entrenador) { this.entrenador = entrenador; }

    public void agregarRutina(Rutina r) { rutinas.add(r); }
}
