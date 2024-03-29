# [Products](https://github.com/Marc0Franc0/Products#Products)
Este sistema permite a los usuarios agregar, visualizar, modificar y eliminar productos en una base de datos. Con una interfaz intuitiva, los usuarios podrán controlar el inventario de productos y acceder fácilmente a la información relevante

## Características
- CRUD para la entidad "Product"

## Tecnologías
- Java
- Swing
- Maven
- Lombok

## Ejecución
1. Clonar repositorio:

```shell
git clone https://github.com/Marc0Franc0/Converter.git
```
2. Ir al directorio del proyecto: 

```shell
cd Converter
```
3. Seguir pasos para ejecución con Maven

## Requerimientos para ejecutar con Maven

Para construir y ejecutar la aplicación necesita:
- [JDK 20+](https://www.oracle.com/java/technologies/downloads/#java20)
- [Maven 3+](https://maven.apache.org)

4. Debe crear una base de datos local MySQL con el nombre "products"

5. Ejecución en maquina local

```shell
mvn clean install package
```

```shell
cd target
```

```shell
 java -jar Con
