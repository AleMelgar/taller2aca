import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static GestorProductos gestor = new GestorProductos();

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n=== Sistema de Gestión de Productos ===");
            System.out.println("1. Agregar producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Actualizar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Precio: ");
                    double precio = scanner.nextDouble();
                    scanner.nextLine();
                    gestor.agregar(nombre, precio);
                    break;
                case 2:
                    gestor.listar();
                    break;
                case 3: System.out.println("(Update - próximamente)"); break;
                case 4: System.out.println("(Delete - próximamente)"); break;
                case 0: System.out.println("Saliendo..."); break;
                default: System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }
}