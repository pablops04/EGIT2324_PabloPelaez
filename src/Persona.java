public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;

    // Constructor de la clase Persona
    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    // Método Cumpleaños que aumenta la edad en 1 y muestra por pantalla el valor actualizado
    public void Cumpleaños() {
        edad++; 
        System.out.println("¡Felicidades! Ahora tienes " + edad + " años.");
    }


    // Métodos getters y setters 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void datosPersona() {
     System.out.println("Nombre: " + nombre);
     System.out.println("Apellidos: " + apellidos);
     System.out.println("Edad: " + edad);
     
    }
}
