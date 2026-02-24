# Memoria del Proyecto: Sistema de Gestión de Librería

## 1. Introducción
Este proyecto consiste en el diseño e implementación de un sistema de gestión para una librería en Java. El sistema permite administrar libros (Novelas y Libros de Texto), autores y clientes, gestionando el catálogo y las operaciones de venta.

## 2. Decisiones de Diseño

### Estructura de Clases
- **Herencia**: Se utilizó una clase abstracta `Book` para definir los atributos comunes (`title`, `isbn`, `price`, `year`). Las clases `Novel` y `Textbook` heredan de esta, añadiendo sus atributos específicos (`genre` y `educationalLevel` respectivamente).
- **Relaciones**:
    - **Muchos a Muchos**: Un libro puede tener múltiples autores y un autor puede haber escrito varios libros. Esto se implementó mediante listas (`ArrayList`) en ambas clases, manteniendo la consistencia bidireccional mediante el método `addAuthor`.
    - **Gestión de Catálogo**: La clase `Bookstore` actúa como el controlador del sistema, gestionando una lista de libros disponibles.
    - **Clientes**: La clase `Client` mantiene un historial de libros comprados.

### Lógica de Negocio
- **Venta de Libros**: Al vender un libro, este se elimina del catálogo de la librería y se añade a la lista de compras del cliente, asegurando que el stock se actualice correctamente.
- **Búsqueda**: Se implementaron métodos de búsqueda por título y por autor utilizando Streams de Java para una manipulación eficiente de las colecciones.

## 3. Guía de Ejecución
Para ejecutar el sistema:
1. Asegurarse de tener el JDK instalado.
2. Compilar los archivos en la carpeta `src`:
   ```bash
   javac src/*.java
   ```
3. Ejecutar la clase principal:
   ```bash
   java -cp src Main
   ```

## 4. Conclusión
El sistema cumple con todos los requisitos planteados en el laboratorio, utilizando conceptos fundamentales de Programación Orientada a Objetos como la abstracción, herencia, encapsulamiento y polimorfismo.
