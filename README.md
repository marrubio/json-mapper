# json-mapper sample

Ejemplo práctico para cargar un fichero JSON a una clase Java.

## Getting Started

En este caso , se utiliza la salida de la operacion de busqueda de docuware para cargarla en una clase (VO) para poder recorrer los todos los objetos que contiene.

### Run code

Para ejecutar el main mediante Maven

```
mvn exec:java "-Dexec.mainClass=com.develop.app.App"
```

Los VO's se han generado desde la web
[jsonschema2pojo.org](http://www.jsonschema2pojo.org/)

