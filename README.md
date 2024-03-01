# Modularización con virtualización e Introducción a Docker
Este laboratorio consiste en crear una aplicación web pequeña usando el micro-framework de Spark java y construir un container para docker para la aplicación y los desplegaremos y configuraremos en nuestra máquina local. Luego, crearemos un repositorio en DockerHub y subiremos la imagen al repositorio.
# Classes
SparkWebServer: servidor web simple que realiza diversas operaciones matemáticas y verifica si una cadena es un palíndromo, proporcionando los resultados correspondientes a través de solicitudes HTTP GET.
# Pre Requisitos
* Java: Es un lenguaje de programación de propósito general orientado a objetos, portátil y muy versátil.
  
* Maven: Es una herramienta que maneja el ciclo de vida del programa.
  
* Git: Es un sistema de control de versiones distribuido (VCS).
  
* Docker: Es un proyecto de código abierto que automatiza el despliegue de aplicaciones dentro de contenedores de software.

# Instrucciones de uso

1. Clona el repositorio a tu máquina local:
   ```
   git clone https://github.com/NicolasCastro9/AREP_LAB05.git
   ```
2. En la consola de comandos navegar hasta el directorio donde se encuentra el pom del proyecto
   ```
   cd /virtualizacion
   ```
3. Ejecuta el siguiente comando para compilar el proyecto y descargar las dependencias definidas en el archivo
   ```
   mvn clean install
   ```
4. Revisar que se hayan instalado las dependencias

   ![image](https://github.com/NicolasCastro9/AREP_LAB05/assets/98556822/5c5cd48b-1675-4605-80f3-415214a6f222)

5. Ejecutamos el programa invocando la máquina virtual de Java desde la línea de comandos
  ```
  java -cp "target/classes;target/dependency/*" edu.escuelaing.arem.ASE.app.SparkWebServer
  ```
6. Ingresamos a la siguiente URL
  ```
  http://localhost:4567/
  ```
![image](https://github.com/NicolasCastro9/AREP_LAB05/assets/98556822/587b24b3-baf6-4d73-a0fd-9725a3d6cf39)

7. funcion seno
   
   ![image](https://github.com/NicolasCastro9/AREP_LAB05/assets/98556822/b37cdee9-07e3-445c-b913-b84cf92fe80d)
   ![image](https://github.com/NicolasCastro9/AREP_LAB05/assets/98556822/28e3f110-747b-4291-986f-98d0067cd4ea)
8. funcion coseno
    
   ![image](https://github.com/NicolasCastro9/AREP_LAB05/assets/98556822/16a1ad48-084d-4790-978b-139b75a4ddf8)
   
9. Palindromo

 ![image](https://github.com/NicolasCastro9/AREP_LAB05/assets/98556822/c2a153af-7a70-48bd-a08e-6ee711789da5)
 ![image](https://github.com/NicolasCastro9/AREP_LAB05/assets/98556822/a1153b85-b798-4042-a203-e3d119fe6b1b)
 ![image](https://github.com/NicolasCastro9/AREP_LAB05/assets/98556822/1d35da3f-bf03-4cd5-97bb-0e822b450154)
 ![image](https://github.com/NicolasCastro9/AREP_LAB05/assets/98556822/4941d962-519d-4606-b87a-e4a596d0e4da)

10. Magnitud del vector

![image](https://github.com/NicolasCastro9/AREP_LAB05/assets/98556822/350b7d46-8097-4f0e-80f4-81b6f553d9bd)
![image](https://github.com/NicolasCastro9/AREP_LAB05/assets/98556822/a8755876-4e52-4373-a943-bb3d49f98807)






docker pull tankiandown/arep_lab05:latest
docker pull tankiandown/arep_lab05:latest
docker run -d -p 34000:6000 --name virtualizacion tankiandown/arep_lab05 
