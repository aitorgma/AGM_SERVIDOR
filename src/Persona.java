import java.util.Objects;

public class Persona {
//Atributos privados
private String dni;
private String nombre;
private int edad;


//Constructor que incluya todos los atributos
public Persona (String dni, String nombre, int edad) {
this.dni= dni;
this.nombre= nombre;
this.edad = edad;

}

// Getters
public String getDni() {
    return dni;
}

public String getNombre() {
    return nombre;
}

public int getEdad() {
    return edad;
}

// Setters
public void setDni(String dni) {
    this.dni = dni;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public void setEdad(int edad) {
    this.edad = edad;
}

// toString
@Override
public String toString() {
    return  nombre + " con DNI " + dni +  " y una edad de " + edad + " años";
}

// equals basado en DNI
@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Persona persona = (Persona) obj;
    return dni.equals(persona.dni);
}

// hashCode basado en DNI
@Override
public int hashCode() {
    return Objects.hash(dni);
}
}

