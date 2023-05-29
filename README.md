
# Ej01Equipo 

## Indice

### Controlador
  
###### CursoController

### Dao
  
###### CursoDao

### Inicio
  
###### Ej02CursoApplication.java
  
### Modelo
  
###### Curso
  
### Servicio

###### CursosService
  
###### CursosServiceImpl
  
 ## Descripción del proyecto 

Es una aplicacion que consta de un CRUD y una base de datos externa.

Está creado en Elipse y la base de datos en MySQL.


  
  ## Ejemplo del código 
  
#### Clase Curso y CursosDao
  
![Ejemplo del código](https://github.com/robertopracticaspg/Ej02Curso/blob/main/ejemplocodigo1.png)
  
 #### CursosService y CursosServiceImpl
  
 ![Ejemplo del código](https://github.com/robertopracticaspg/Ej02Curso/blob/main/ejemplocodigo2.png)
  
  ## Principales tecnologías y herramientas utilizadas en el proyecto

- Spring Boot
- Spring Data JPA
- MySQL 
  

  
  ## Características

(CRUD) 

- Crear
- Leer
- Actualizar
- Eliminar 
  

  
  ## Acceso al proyecto 

https://github.com/robertopracticaspg/Ej02Curso
  
  
 
  ## Uso
  
- Clona el repositorio en tu máquina local.

- Abre el proyecto en tu IDE.

- Asegúrate de tener todas las dependencias necesarias y la configuración de la base de datos correcta.

- Ejecuta la aplicación.

- Utiliza una herramienta para realizar solicitudes HTTP (por ejemplo, Postman) y prueba los diferentes endpoints disponibles.
  
  
  ## Endpoints disponibles 
  
- GET /cursos: Devuelve todos los cursos disponibles. La respuesta se produce en formato JSON.
- GET /cursos/{codCurso}: Busca un curso específico según el código del curso proporcionado. El código del curso se pasa como una variable en la URL. La respuesta se produce en formato JSON.
- POST /cursos: Crea un nuevo curso. El cuerpo de la solicitud debe contener los datos del curso en formato JSON.
- PUT /actualizar_curso/{codCurso}: Actualiza la duración de un curso existente. El código del curso se pasa como una variable en la URL, y la nueva duración se proporciona en el cuerpo de la solicitud en formato JSON.
- DELETE /cursos/{codCurso}: Elimina un curso específico según el código del curso proporcionado. El código del curso se pasa como una variable en la URL. La respuesta se produce en formato JSON y devuelve una lista actualizada de cursos después de eliminar el curso especificado.
- GET /cursos/precio/{precioMin}/{precioMax}: Busca y devuelve una lista de cursos que tienen un precio en el rango especificado. Los valores mínimo y máximo del precio se pasan como variables en la URL. La respuesta se produce en formato JSON.


  
  ## Enlace a la base de datos
  
https://github.com/robertopracticaspg/Ej02Curso/blob/main/bdcurso2.csv
  
  
  
  ## Personas desarolladoras del proyecto

Roberto Pesquera García.

https://github.com/robertopracticaspg

  
  
  ## Estado del proyecto

<h4 align="center">
✔️ Finalizado ✔️
</h4>
</h4>
