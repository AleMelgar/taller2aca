---
title: Instalación y uso
summary: Cómo compilar y ejecutar el CRUD de productos en Java.
---

# Instalación y uso

Esta página explica cómo obtener el código, compilarlo y ejecutar la aplicación de
consola.

## Requisitos previos

| Requisito | Versión mínima | Comprobar con |
| --- | --- | --- |
| Java JDK | 17 | `java -version` |
| Git | 2.x | `git --version` |

!!! warning "Verifica tu versión de Java"
    El proyecto usa características de Java moderno. Si `java -version` muestra una
    versión inferior a la 17, actualiza el JDK antes de continuar.

## 1. Clonar el repositorio

Puedes clonar desde cualquiera de los dos remotos:

=== "GitHub"

    ```bash
    git clone https://github.com/AleMelgar/taller2aca.git
    cd taller2aca/taller2CRUD
    ```

=== "Codeberg"

    ```bash
    git clone https://codeberg.org/aledeleonn/taller2aca.git
    cd taller2aca/taller2CRUD
    ```

## 2. Compilar y ejecutar

Los comandos varían según tu sistema operativo:

=== "Linux / macOS"

    ```bash
    # Compilar las clases dentro de la carpeta out/
    javac -d out src/*.java

    # Ejecutar la aplicación
    java -cp out Main
    ```

=== "Windows"

    ```powershell
    # Compilar las clases dentro de la carpeta out\
    javac -d out src\*.java

    # Ejecutar la aplicación
    java -cp out Main
    ```

## 3. Usar el menú

Al ejecutar el programa verás el menú interactivo:

```text
=== Sistema de Gestión de Productos ===
1. Agregar producto
2. Listar productos
3. Actualizar producto
4. Eliminar producto
0. Salir
Selecciona una opción:
```

Escribe el número de la opción y pulsa **Enter**. El detalle de cada operación está
en la página de [Operaciones CRUD](operaciones.md).

!!! tip "Los datos no se guardan en disco"
    Los productos se almacenan en memoria mientras la aplicación está abierta. Al
    cerrar el programa (opción `0`), la lista se reinicia.
