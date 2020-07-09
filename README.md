# CompanyRegistration
 Micro servicio que permite el registro de las compañias en el sistema y el registro de estados para los productos. Expone las operaciones básicas CRUD mediante los siguientes endpoint:
 

 ```
 Listar todas las empresas en el sistema (GET):
 http://host:8080/empresas
 ```

 ```
 Consultar una empresa específica (GET):
 http://host:8080/empresas/{id}
 ```

 ```
 Agregar una empresa (POST):
 http://host:8080/empresas/add
 ```

 ```
 Consultar una empresa específica (POST):
 http://host:8080/empresas/add
 ```

 ```
 Consultar una empresa específica (POST):
 http://host:8080/empresas/update
 ```
 
 Los estados de producto siguien la misma lógica con los siguientes endpoint:
 
 ```
 http://host:8080/estadosProducto (GET)
 http://host:8080/estadosProducto/{idEstadoProducto} (GET)
 http://host:8080/estadosProducto/add (POST)
 http://host:8080/estadosProducto/update (POST)
 ```
 
 ## Build With

* [Maven](https://maven.apache.org/) - Manejador de dependencias
* [SpringBoot](https://spring.io/projects/spring-boot) - Para la construcción de la aplicación
* [SpringBoot initializr](https://start.spring.io/) - Para generación del artefacto

## License

This project is licensed under the Apache License 2.0 License
