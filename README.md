# TrabajoCampo
---

# API REST Sistema de Reserva de Canchas de Fútbol
**Documentacion**
https://drive.google.com/drive/folders/1L-gvJHszgeUs6EaBPsW1Gt1E9cnnR21F?usp=sharing
Encontraran Collection para POSTMAN y Un pdf de con informacion del proyecto.

**Sistema-Reservas** permite a los usuarios realizar reservas de canchas de fútbol 5 y 7 en el predio **Las Canchas**. Los usuarios pueden registrarse, iniciar sesión y reservar canchas de manera sencilla y sin necesidad de contactar directamente con el predio. El sistema permite a los administradores gestionar las reservas, incluyendo la capacidad de ver, agregar, editar o borrar las reservas existentes.

**Horarios de apertura:** 15:00 a 23:00.

## Lanzar la Aplicación

### Tecnologías Utilizadas

- **Spring Boot**
- **Maven 3.9.6**
- **Lombok**
- **JDK 22+**
- **PostgreSQL 16**
- **DBeaver**
- **IntelliJ IDEA**

### Enlaces de Descarga de Instaladores

- [Java JDK](https://www.oracle.com/ar/java/technologies/downloads/)
- [Maven](https://dlcdn.apache.org/maven/maven-3/3.9.6/binaries/)
- [PostgreSQL](https://www.postgresql.org/download/)
- [DBeaver](https://dbeaver.io/download/)
- [Lombok](https://projectlombok.org/download)
- [Postman](https://www.postman.com/downloads/)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/download/)

### Instalación de Dependencias

Realizar la instalación de los archivos requeridos para el sistema. **Tener en cuenta que Maven y Lombok se instalan en la carpeta Java.**

#### Instalación de Variables de Entorno

1. En Buscar, seleccione: **Sistema (Panel de control)**
2. Haga clic en el enlace **Configuración avanzada del sistema**.
3. Haga clic en **Variables de entorno**.
4. En la sección **Variables del sistema** busque la variable de entorno **PATH** y selecciónela. Haga clic en **Editar**. Si no existe la variable de entorno **PATH**, haga clic en **Nuevo**.
5. En la ventana **Editar la variable del sistema** (o **Nueva variable del sistema**), especifique el valor de la variable de entorno **PATH**.
6. Haga clic en **Aceptar**.
7. Cierre todas las demás ventanas haciendo clic en **Aceptar**.

**Nota:** En el PATH debe ir para `JAVA_HOME` el bin de Java, y en `MAVEN_HOME` el bin de Maven.


### Ejecución de la Aplicación

Por defecto, la aplicación se inicia en el puerto **cambiar** pero se puede cambiar a otro valor configurando la variable de entorno **PORT** en su sistema operativo.



## Base de Datos

Esta aplicación utiliza una base de datos **PostgreSQL**.

### Configuración de la Base de Datos

- **Conexión:** `localhost:5432`
- **Usuario:** `postgres`
- **Contraseña:** `1234`

### Creación y Restauración de la Base de Datos

1. Realizar en **DBeaver** la creación de la base de datos.
2. Restaurar con la imagen `SistemaReservas.sql`.

## Modelo de Datos

El modelo de datos posee 7 tablas:

- `usuarios`
- `rol`
- `reservas`
- `canchas`
- `canchas_precios`
- `horas`
- `precios_hora`
- `contactos`

## Diagrama de Base de Datos

![Diagrama de Base de Datos](path/to/diagram.png)

## Levantar Aplicación

## Endpoints de la Aplicación

### Usuario Controller

- **Crear nuevo usuario**
    - **Endpoint:** `POST /usu/guardar`
    - **Body:**
      ```json
      {
          "username": "nuevoUsu",
          "idPassword": "123456"
      }
      ```

- **Obtener todos los usuarios**
    - **Endpoint:** `GET /usu/getall`
    - **Descripción:** Este endpoint devuelve una lista de todos los usuarios registrados.

- **Obtener usuario por ID**
    - **Endpoint:** `GET /usu/get/{id}`
    - **Parámetro:** `id` (ID del usuario a consultar)

- **Eliminar usuario por ID**
    - **Endpoint:** `DELETE /usu/eliminar/{id}`
    - **Parámetro:** `id` (ID del usuario a eliminar)

### ContactoController

- **Obtener todos los contactos**
    - **Endpoint:** `GET /contacto/getall`
    - **Descripción:** Este endpoint devuelve una lista de todos los contactos registrados.

- **Guardar un nuevo contacto**
    - **Endpoint:** `POST /contacto/guardar`
    - **Body:** (Ejemplo de estructura de datos, la colección no especifica)
      ```json
      {
          "mail": "example@example.com",
          "ntelefono": "123456789",
          "nombre": "John",
          "apellido": "Doe"
      }
      ```

- **Eliminar contacto**
    - **Endpoint:** `DELETE /contacto/eliminar/{id}`
    - **Parámetro:** `id` (ID del contacto a eliminar)

- **Obtener contacto por ID**
    - **Endpoint:** `GET /contacto/getcontacto/{id}`
    - **Parámetro:** `id` (ID del contacto a consultar)

### Reservas

- **Consultar disponibilidad de reserva**
    - **Endpoint:** `POST /api/reservations/available-hour`
    - **Body:**
      ```json
      {
          "fecha": "2024-06-15"
      }
      ```

- **Crear nueva reserva**
    - **Endpoint:** `POST /api/reservation`
    - **Body:**
      ```json
      {
          "idUsuario": 1,
          "idCanchaPrecio": 2,
          "fecha": "2024-06-18",
          "idHora": 3
      }
      ```

- **Modificar una reserva existente**
    - **Endpoint:** `POST /api/reservation/modificar/reserva`
    - **Body:**
      ```json
      {
          "idReserva": 15,
          "idUsuario": 2,
          "idCanchaPrecio": 1,
          "fecha": "2024-06-17",
          "idHora": 2
      }
      ```

### Canchas Precios

- **Obtener Cancha-Precio por ID**
    - **Endpoint:** `GET /canchas-precios/{id}`
    - **Parámetro:** `id` (ID de la cancha-precio a consultar)

- **Obtener todas las Cancha-Precios**
    - **Endpoint:** `GET /canchas-precios/getall`
    - **Descripción:** Este endpoint devuelve una lista de todas las asociaciones cancha-precio.

- **Crear nueva Cancha-Precio**
    - **Endpoint:** `POST /canchas-precios/crear`
    - **Body:**
      ```json
      {
          "descripcionCancha": "Cancha de fútbol 6",
          "valorPesos": 20000.00
      }
      ```

---

