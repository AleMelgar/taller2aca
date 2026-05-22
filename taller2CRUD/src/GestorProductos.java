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

    public void actualizar(int id, String nuevoNombre, double nuevoPrecio) {
        for (Producto p : productos) {
            if (p.getId() == id) {
                p.setNombre(nuevoNombre);
                p.setPrecio(nuevoPrecio);
                System.out.println("✔ Producto actualizado: " + p);
                return;
            }
        }
        System.out.println("Producto con ID " + id + " no encontrado.");
    }

    public void eliminar(int id) {
        boolean eliminado = productos.removeIf(p -> p.getId() == id);
        if (eliminado) {
            System.out.println("✔ Producto con ID " + id + " eliminado.");
        } else {
            System.out.println("Producto con ID " + id + " no encontrado.");
        }
    }
}

