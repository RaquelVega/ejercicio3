import java.util.ArrayList;

public class Gimnasio {
    private ArrayList<Miembro> miembros;
    private ArrayList<Entrenador> entrenadores;
    private ArrayList<Rutina> rutinas;

    public Gimnasio() {
        this.miembros = new ArrayList<>();
        this.entrenadores = new ArrayList<>();
        this.rutinas = new ArrayList<>();
    }

    // Getters y Setters
    public ArrayList<Miembro> getMiembros() { return miembros; }
    public void setMiembros(ArrayList<Miembro> miembros) { this.miembros = miembros; }

    public ArrayList<Entrenador> getEntrenadores() { return entrenadores; }
    public void setEntrenadores(ArrayList<Entrenador> entrenadores) { this.entrenadores = entrenadores; }

    public ArrayList<Rutina> getRutinas() { return rutinas; }
    public void setRutinas(ArrayList<Rutina> rutinas) { this.rutinas = rutinas; }

    // Métodos de registro
    public void agregarMiembro(Miembro m) { miembros.add(m); }
    public void agregarEntrenador(Entrenador e) { entrenadores.add(e); }
    public void agregarRutina(Rutina r) { rutinas.add(r); }

    // 🔹 Reporte: rutina más practicada
    public Rutina rutinaMasPracticada() {
        Rutina masPracticada = null;
        int max = 0;
        for (Rutina r : rutinas) {
            int count = 0;
            for (Miembro m : miembros) {
                if (m.getRutinas().contains(r)) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                masPracticada = r;
            }
        }
        return masPracticada;
    }

    // 🔹 Reporte: número total de rutinas activas
    public int numeroRutinasActivas() {
        int count = 0;
        for (Rutina r : rutinas) {
            if (r.isActiva()) {
                count++;
            }
        }
        return count;
    }

    // 🔹 Reporte: entrenador con más alumnos
    public Entrenador entrenadorConMasAlumnos() {
        Entrenador top = null;
        int max = 0;
        for (Entrenador e : entrenadores) {
            if (e.getMiembros().size() > max) {
                max = e.getMiembros().size();
                top = e;
            }
        }
        return top;
    }
}
