public class Principal {
    public static void main(String[] args) {
        Gimnasio gym = new Gimnasio();

        // Crear entrenadores
        Entrenador entrenador1 = new Entrenador(1, "Carlos López", "Fuerza");
        Entrenador entrenador2 = new Entrenador(2, "María Gómez", "Cardio");
        gym.agregarEntrenador(entrenador1);
        gym.agregarEntrenador(entrenador2);

        // Crear miembros
        Miembro miembro1 = new Miembro(1, "Ana Pérez", 25, "Premium", entrenador1);
        Miembro miembro2 = new Miembro(2, "Luis Hernández", 30, "Mensual", entrenador2);
        Miembro miembro3 = new Miembro(3, "Sofía Morales", 28, "Anual", entrenador1);

        gym.agregarMiembro(miembro1);
        gym.agregarMiembro(miembro2);
        gym.agregarMiembro(miembro3);

        entrenador1.agregarMiembro(miembro1);
        entrenador1.agregarMiembro(miembro3);
        entrenador2.agregarMiembro(miembro2);

        // Crear rutinas
        Rutina rutina1 = new Rutina(1, "Full Body", true);
        rutina1.agregarEjercicio(new Ejercicio(1, "Sentadillas", "Piernas", 15, 3));
        rutina1.agregarEjercicio(new Ejercicio(2, "Lagartijas", "Pecho", 10, 4));

        Rutina rutina2 = new Rutina(2, "Cardio Extremo", true);
        rutina2.agregarEjercicio(new Ejercicio(3, "Correr", "Cinta de correr", 20, 1));

        Rutina rutina3 = new Rutina(3, "Yoga Relajante", false);

        gym.agregarRutina(rutina1);
        gym.agregarRutina(rutina2);
        gym.agregarRutina(rutina3);

        // Asignar rutinas a miembros
        miembro1.agregarRutina(rutina1);
        miembro2.agregarRutina(rutina2);
        miembro3.agregarRutina(rutina1);

        // 🔹 Probar reportes
        System.out.println("📌 Rutina más practicada: " + gym.rutinaMasPracticada().getNombre());
        System.out.println("📌 Número de rutinas activas: " + gym.numeroRutinasActivas());
        System.out.println("📌 Entrenador con más alumnos: " + gym.entrenadorConMasAlumnos().getNombre());
    }
}
