public class Hoteles {
    String nombre;
    String direccion;
    int estrellas;
    int num_habitaciones;
    Double precio_noche;

    public Hoteles() {
    }

    //Constructor es un método especial que se utiliza para inicializar objetos
    public Hoteles(String nombre, String direccion, int estrellas, int num_habitaciones, Double precio_noche) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.estrellas = estrellas;
        this.num_habitaciones = num_habitaciones;
        this.precio_noche = precio_noche;
    }

    //Getters and Setters son métodos utilizados para acceder y modificar los campos privados de una clase
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public int getNum_habitaciones() {
        return num_habitaciones;
    }

    public void setNum_habitaciones(int num_habitaciones) {
        this.num_habitaciones = num_habitaciones;
    }

    public Double getPrecio_noche() {
        return precio_noche;
    }

    public void setPrecio_noche(Double precio_noche) {
        this.precio_noche = precio_noche;
    }

    //Metodo Imprimir Informacion
    public void imprimirInformacion() {
        System.out.println("               Hoteles         " +
                "Nombre='" + nombre + '\'' +
                ", Direccion='" + direccion + '\'' +
                ", Estrellas=" + estrellas +
                ", Numero de habitaciones=" + num_habitaciones +
                ", Precio por noche=" + precio_noche);
    }

}
