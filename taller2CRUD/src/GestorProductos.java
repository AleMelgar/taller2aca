import java.util.ArrayList;

public class GestorProductos {
    private ArrayList<Producto> productos = new ArrayList<>();
    private int contadorId = 1;

    public void agregar(String nombre, double precio) {
        Producto p = new Producto(contadorId++, nombre, precio);
        productos.add(p);
        System.out.println("✔ Producto agregado: " + p);
    }

    public void listar() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados.");
            return;
        }
        System.out.println("\n=== Lista de Productos ===");
        for (Producto p : productos) {
            System.out.println(p);
        }
    }
}
