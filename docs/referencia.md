---
title: Referencia de clases
summary: Documentación de las clases Producto, GestorProductos y Main.
---

# Referencia de clases

El proyecto se compone de tres clases. La siguiente tabla las resume:

| Clase | Responsabilidad |
| --- | --- |
| `Producto` | Modelo de datos de un producto. |
| `GestorProductos` | Lógica del CRUD sobre la lista de productos. |
| `Main` | Punto de entrada y menú de consola. |

## Producto

Representa un producto con `id`, `nombre` y `precio`.

| Miembro | Tipo | Descripción |
| --- | --- | --- |
| `id` | `int` | Identificador único (solo lectura). |
| `nombre` | `String` | Nombre del producto. |
| `precio` | `double` | Precio del producto. |

```java
public class Producto {
    private int id;
    private String nombre;
    private double precio;

    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPrecio(double precio) { this.precio = precio; }

    @Override
    public String toString() {
        return "ID: " + id + " | Nombre: " + nombre + " | Precio: $" + precio;
    }
}
```

## GestorProductos

Contiene la lógica de las operaciones descritas en
[Operaciones CRUD](operaciones.md). Mantiene la lista en memoria y el contador de IDs.

| Método | Parámetros | Operación |
| --- | --- | --- |
| `agregar` | `nombre`, `precio` | Create |
| `listar` | — | Read |
| `actualizar` | `id`, `nuevoNombre`, `nuevoPrecio` | Update |
| `eliminar` | `id` | Delete |

```java
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
        for (Producto p : productos) {
            System.out.println(p);
        }
    }
    // actualizar() y eliminar() en el código fuente completo
}
```

## Main

Punto de entrada de la aplicación. Muestra el menú y delega cada opción en
`GestorProductos` mediante un `Scanner`.

!!! note "Diseño por capas"
    `Main` solo se encarga de la **interacción con el usuario**; toda la lógica del
    CRUD vive en `GestorProductos`. Esto mantiene el código organizado y fácil de
    mantener.

¿Quieres ver cómo ejecutarlo? Vuelve a [Instalación y uso](instalacion.md).
