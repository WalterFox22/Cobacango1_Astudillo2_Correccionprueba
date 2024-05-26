public class Main {
    public static void main(String[] args) {
        System.out.println("-------- Correccion de la prueba --------");

        // Valores quemados
        Hoteles hotel1 = new Hoteles("Hotel Quito", "Av. Gonzalez Suárez", 5, 100, 200.0);
        Hoteles hotel2 = new Hoteles("Hotel Colón", "Av. Amazonas y Patria", 4, 80, 150.0);
        Hoteles hotel3 = new Hoteles("Hotel Oro Verde", "9 de Octubre y Garcia Moreno", 3, 60, 100.0);
        Hoteles hotel4 = new Hoteles("Hotel Hilton Colon", "Av. Francisco de Orellana", 2, 50, 80.0);
        Hoteles hotel5 = new Hoteles("Hotel Carrion", "Luis Cordero", 1, 30, 50.0);

        // Valores nulos
        Hoteles hotel6 = new Hoteles();
        Hoteles hotel7 = new Hoteles();

        // Valores setteados
        hotel6.setNombre("Hotel Oro Verde Cuenca");
        hotel6.setDireccion("Av. Ordoñez Lasso");
        hotel6.setEstrellas(4);
        hotel6.setNum_habitaciones(70);
        hotel6.setPrecio_noche(180.0);

        hotel7.setNombre("Hotel Royal Cuenca");
        hotel7.setDireccion("Av. De las Americas");
        hotel7.setEstrellas(3);
        hotel7.setNum_habitaciones(40);
        hotel7.setPrecio_noche(120.0);

        // Modificar los objetos creados
        modificarHotel(hotel1, "Hotel Fox", "Ponceano", 4, 90, 190.0);
        modificarHotel(hotel2, "Hotel EPN", "Av. Panamericana norte y Catalina", 3, 70, 140.0);

        // Imprimir todos los objetos
        hotel1.imprimirInformacion();
        hotel2.imprimirInformacion();
        hotel3.imprimirInformacion();
        hotel4.imprimirInformacion();
        hotel5.imprimirInformacion();
        hotel6.imprimirInformacion();
        hotel7.imprimirInformacion();

        // Modificar obejtos con el valor NULL y mostrar
        setNullos(hotel3);
        setNullos(hotel4);
        setNullos(hotel5);

        // Imprimir los hoteles con atributos nulos individualmente
        System.out.println("Hoteles con atributos nulos:");
        hotel3.imprimirInformacion();
        hotel4.imprimirInformacion();
        hotel5.imprimirInformacion();
    }


    // Método para modificar un objeto Hotel
    public static void modificarHotel(Hoteles hotel, String nombre, String direccion, int estrellas, int num_habitaciones, Double precio_noche) {
        hotel.setNombre(nombre);
        hotel.setDireccion(direccion);
        hotel.setEstrellas(estrellas);
        hotel.setNum_habitaciones(num_habitaciones);
        hotel.setPrecio_noche(precio_noche);
    }

    // Método para establecer todos los atributos a nulos
    public static void setNullos(Hoteles hotel) {
        hotel.setNombre(null);
        hotel.setDireccion(null);
        hotel.setEstrellas(0);
        hotel.setNum_habitaciones(0);
        hotel.setPrecio_noche(null);
    }

}