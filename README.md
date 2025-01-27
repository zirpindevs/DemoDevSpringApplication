# Proyecto: Servicio de Información de Proveedores

Este proyecto tiene como objetivo construir un servicio para obtener la información de los proveedores de un cliente. Utiliza **Java Spring Boot** como backend, con una base de datos conectada mediante **JPA**, y está diseñado para ser consultado desde Postman a través de un endpoint REST. Además, incluye tests unitarios implementados con **JUnit 5**.

---

## Tecnologías utilizadas

- **Java 17**
- **Spring Boot 3.x**
  - Spring Web
  - Spring Data JPA
- **MySQL** como base de datos
- **JUnit 5** para tests unitarios
- **Postman** para pruebas de los endpoints
- **Springdoc OpenAPI** para documentación interactiva (Swagger UI)

---

## Funcionalidades principales

1. **Consulta de Proveedores**:
   - Obtiene una lista de proveedores asociados a un cliente.
   - Devuelve un array con los resultados en formato JSON.
   - Si no hay datos, devuelve una lista vacía (`[]`).

2. **Endpoint REST**:
   - Endpoint disponible para consultar desde Postman o cualquier cliente HTTP.

3. **Tests Unitarios**:
   - Validación de la lógica de negocio.
   - Simulación de operaciones de base de datos.

4. **Documentación de la API**:
   - Acceso a la documentación Swagger UI para interactuar con la API.

---

## Requisitos previos

1. **Java**:
   - Asegúrate de tener **Java 17** instalado.

2. **Maven**:
   - Utilizado para construir el proyecto y manejar las dependencias.

3. **Base de datos MySQL**:
   - Crea una base de datos MySQL para el proyecto.
   - Configura las credenciales en el archivo `application.properties`.

---

## Configuración

1. **Clonar el repositorio**:
   ```bash
   git clone https://github.com/zirpindevs/DemoDevSpringApplication.git
   cd tuproyecto
   ```

2. **Configurar la base de datos**:
   Edita el archivo `src/main/resources/application.properties` para proporcionar los detalles de tu base de datos MySQL:
   ```properties
   spring.datasource.url=jdbc:mysql://zirpin.es:3306/DemodevSrpingDB
   spring.datasource.username=devSrpingUser
   spring.datasource.password=devSrpingUser1234

   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
   ```

3. **Construir el proyecto**:
   ```bash
   mvn clean install
   ```

4. **Ejecutar la aplicación**:
   ```bash
   mvn spring-boot:run
   ```

---

## Endpoint REST

### Obtener todos los proveedores
- **URL**: `/api/proveedores`
- **Método HTTP**: `GET`
- **Respuesta**:
  - **200 OK**: Devuelve una lista de proveedores en formato JSON.
  - **Ejemplo**:
    ```json
    [
        {
            "idProveedor": 1,
            "nombre": "Coca-cola",
            "fechaDeAlta": "2025-01-01",
            "idCliente": 5
        },
        {
            "idProveedor": 2,
            "nombre": "Pepsi",
            "fechaDeAlta": "2025-01-02",
            "idCliente": 6
        }
    ]
    ```
  - **Lista vacía**:
    ```json
    []
    ```

---

## Tests

Los tests unitarios están implementados usando **JUnit 5**. Puedes ejecutar los tests con:

```bash
mvn test
```

Los tests cubren los siguientes casos:
- **Consulta de proveedores**:
  - Lista vacía.
  - Lista con datos.
---

## Autor

- **Javier Moreno Cidoncha**  
  - Correo: [zirpin@gmail.com](mailto:tuemail@dominio.com)
---

© 2025 - Proyecto desarrollado con Java Spring Boot.

