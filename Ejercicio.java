public class Ejercicio {
    private int idEjercicio;
    private String nombre;
    private String descripcion;
    private int repeticiones;
    private int series;

    public Ejercicio(int idEjercicio, String nombre, String descripcion, int repeticiones, int series) {
        this.idEjercicio = idEjercicio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.repeticiones = repeticiones;
        this.series = series;
    }

    public int getIdEjercicio() { return idEjercicio; }
    public void setIdEjercicio(int idEjercicio) { this.idEjercicio = idEjercicio; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public int getRepeticiones() { return repeticiones; }
    public void setRepeticiones(int repeticiones) { this.repeticiones = repeticiones; }

    public int getSeries() { return series; }
    public void setSeries(int series) { this.series = series; }
}
