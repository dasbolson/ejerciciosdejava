package mascotapp.entidades;

public class Mascota {

    private String nombre;
    private String apodo;
    // gato, perro, conejo,loro
    private String tipo;
    private String color;
    private int edad;
    private boolean cola;
    private String raza;

    public Mascota() {

    }

    public Mascota(String nombre, String apodo, String tipo) {

        this.nombre = nombre;
        this.apodo = apodo;

        if (tipo.equals("Perro") || tipo.equals("Gato") || tipo.equals("Loro") || tipo.equals("Conejo") || tipo.equals("Carpincho")) {
            this.tipo = tipo;
        }

        this.tipo = tipo;
    }

    public Mascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
    }

}
