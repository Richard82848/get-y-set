//esta es la clase persona

public class Persona {
    private String nombre;
    private int edad;
    private String DNI;

    public Persona(String valornombre, int valoredad,String valorDNI ){
        nombre = valornombre;
        edad = valoredad;
        DNI = valorDNI;

    }
    public Persona(){

    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad(){
        return edad;
    }
    public String getDNI(){
        return DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

}
