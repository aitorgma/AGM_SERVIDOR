import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        
        // Crear ArrayList de personas
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("12345678A", "Aitor", 37));
        personas.add(new Persona("23456789B", "Fernando", 52));
        personas.add(new Persona("34567890C", "Luis", 19));
        personas.add(new Persona("45678901D", "Ana", 18));
        personas.add(new Persona("56789012E", "Carlos", 17));
        personas.add(new Persona("67890123F", "Laura", 29));

        // Llamar a los métodos
        System.out.println("Edad del mayor: " + obtenerEdadMayor(personas));
        System.out.println("\nEdad media: " + obtenerEdadMedia(personas));
        System.out.println("\nNombre del mayor: " + obtenerNombreMayor(personas));
        System.out.println("\nPersona mayor: " + obtenerPersonaMayor(personas));
        System.out.println("\nPersonas mayores de edad:");
        for (Persona persona : obtenerMayoresDeEdad(personas)) {
            System.out.println(persona); }
        System.out.println("\nPersonas con edad mayor o igual a la media: ");
        for (Persona persona : obtenerMayoresQueLaMedia(personas)) {
            System.out.println(persona); }
    }

    // Método al que se le pasa un ArrayList de Persona y devuelve la edad del mayor.
    public static int obtenerEdadMayor(ArrayList<Persona> personas) {
        int maxEdad = 0;
        for (Persona persona : personas) {
            if (persona.getEdad() > maxEdad) {
                maxEdad = persona.getEdad();
            }
        }
        return maxEdad;
    }

    // Método al que se le pasa un ArrayList de Persona y devuelve la edad media. (Se hará con números enteros)
    public static int obtenerEdadMedia(ArrayList<Persona> personas) {
        int sumaEdades = 0;
        for (Persona persona : personas) {
            sumaEdades += persona.getEdad();
        }
        return sumaEdades / personas.size();  
    }

    // Método al que se le pasa un ArrayList de Persona y devuelve el nombre del mayor.
    public static String obtenerNombreMayor(ArrayList<Persona> personas) {
        Persona mayor = obtenerPersonaMayor(personas);
        return mayor.getNombre();
    }

    // Método al que se le pasa un ArrayList de Persona y devuelve la Persona mayor
    public static Persona obtenerPersonaMayor(ArrayList<Persona> personas) {
        Persona mayor = personas.get(0);
        for (Persona persona : personas) {
            if (persona.getEdad() > mayor.getEdad()) {
                mayor = persona;
            }
        }
        return mayor;
    }

    // Método al que se le pasa un ArrayList de Persona y devuelve todos los mayores de edad. (>= 18)
    public static ArrayList<Persona> obtenerMayoresDeEdad(ArrayList<Persona> personas) {
        ArrayList<Persona> mayoresDeEdad = new ArrayList<>();
        for (Persona persona : personas) {
            if (persona.getEdad() >= 18) {
                mayoresDeEdad.add(persona);
            }
        }
        return mayoresDeEdad;
    }

    // Método al que se le pasa un ArrayList de Persona y devuelve todos los que tienen una edad mayor o igual a la media
    public static ArrayList<Persona> obtenerMayoresQueLaMedia(ArrayList<Persona> personas) {
        ArrayList<Persona> mayoresQueLaMedia = new ArrayList<>();
        double edadMedia = obtenerEdadMedia(personas);
        for (Persona persona : personas) {
            if (persona.getEdad() >= edadMedia) {
                mayoresQueLaMedia.add(persona);
            }
        }
        return mayoresQueLaMedia;
    }
}