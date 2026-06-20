---
title: Operaciones CRUD
summary: Detalle de las operaciones Create, Read, Update y Delete.
---

# Operaciones CRUD

La aplicación implementa las cuatro operaciones fundamentales de un CRUD. Cada una
corresponde a un método de la clase [`GestorProductos`](referencia.md#gestorproductos).

## Resumen

| Opción del menú | Operación | Método | Acción |
| --- | --- | --- | --- |
| 1 | **Create** | `agregar()` | Añade un producto nuevo. |
| 2 | **Read** | `listar()` | Muestra todos los productos. |
| 3 | **Update** | `actualizar()` | Modifica un producto por su `ID`. |
| 4 | **Delete** | `eliminar()` | Elimina un producto por su `ID`. |

## Create — Agregar producto

Solicita un nombre y un precio, y asigna automáticamente un `ID` autoincremental.

```java
gestor.agregar("Teclado mecánico", 120.0);
// ✔ Producto agregado: ID: 1 | Nombre: Teclado mecánico | Precio: $120.0
```

## Read — Listar productos

Recorre la lista y muestra cada producto. Si está vacía, avisa al usuario.

```java
gestor.listar();
// === Lista de Productos ===
// ID: 1 | Nombre: Teclado mecánico | Precio: $120.0
```

## Update — Actualizar producto

Busca el producto por `ID` y reemplaza su nombre y precio.

```java
gestor.actualizar(1, "Teclado inalámbrico", 95.5);
// ✔ Producto actualizado: ID: 1 | Nombre: Teclado inalámbrico | Precio: $95.5
```

!!! warning "ID inexistente"
    Si el `ID` no existe, la aplicación muestra
    `Producto con ID X no encontrado.` y no realiza ningún cambio.

## Delete — Eliminar producto

Elimina el producto cuyo `ID` coincida usando `removeIf`.

```java
gestor.eliminar(1);
// ✔ Producto con ID 1 eliminado.
```

??? info "¿Cómo funciona la asignación de IDs?"
    El contador `contadorId` empieza en `1` y aumenta cada vez que se agrega un
    producto. Por eso los `ID` **no se reutilizan** aunque elimines un producto.

Para ver el código completo de estos métodos, consulta la
[Referencia de clases](referencia.md).
