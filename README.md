Servicio de Inventario

Este repositorio contiene el código fuente del Servicio de Inventario, un microservicio diseñado para gestionar y proporcionar información sobre el stock de productos. Actúa como la fuente de verdad para el inventario, comunicándose con otros servicios como el de Ventas para validar la disponibilidad de productos antes de que se procesen los pedidos.

Diagrama de Arquitectura
El siguiente diagrama de arquitectura muestra el flujo de interacción en una transacción de venta. El Servicio de Inventario juega un rol crucial al ser consultado por el Servicio de Ventas.

Un cliente envía una solicitud a la API del Servicio de Ventas.

El Servicio de Ventas llama a la API del Servicio de Inventario (GET /inventario/{productoId}).

El Servicio de Inventario verifica el stock disponible y devuelve el resultado.

El Servicio de Ventas usa esta información para completar la transacción.

Requerimientos para Ejecutar el Código
Para poder compilar y ejecutar este proyecto, necesitas tener instaladas las siguientes herramientas en tu sistema:

Java Development Kit (JDK) 17 o superior: Asegúrate de tener la versión 17 (o una más reciente) instalada y configurada correctamente en tu PATH.

Apache Maven 3.9.11 o superior: Maven es necesario para gestionar las dependencias del proyecto y compilar el código fuente.

IntelliJ IDEA (opcional): Es el entorno de desarrollo recomendado para este proyecto, ya que facilita la compilación y ejecución.

Instrucciones para Ejecutar el Programa
Sigue estos pasos para compilar, empaquetar y ejecutar la aplicación.

1. Compilar y Empaquetar el Proyecto
Abre una terminal y navega a la carpeta raíz del proyecto (/Inventario). Luego, ejecuta el siguiente comando para compilar el código y crear un archivo .jar ejecutable:

mvn clean package
Este comando descargará todas las dependencias, compilará el código y generará el archivo Inventario-0.0.1-SNAPSHOT.jar dentro de la carpeta /target.

2. Ejecutar el Servicio
Para iniciar la aplicación, navega a la carpeta /target dentro de tu terminal y ejecuta el siguiente comando:

java -jar Inventario-0.0.1-SNAPSHOT.jar
El servicio de Inventario se iniciará y estará listo para recibir peticiones en el puerto 8081.

3. Probar la Comunicación entre Microservicios
Para probar la interacción con el Servicio de Ventas, puedes enviar una petición HTTP al endpoint de Ventas. La respuesta que obtengas confirmará que el Servicio de Inventario está respondiendo correctamente a las peticiones del otro microservicio.
