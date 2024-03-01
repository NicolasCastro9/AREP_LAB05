# Modularización con virtualización e Introducción a Docker
Este laboratorio consiste en crear una aplicación web pequeña usando el micro-framework de Spark java y construir un container para docker para la aplicación y los desplegaremos y configuraremos en nuestra máquina local. Luego, crearemos un repositorio en DockerHub y subiremos la imagen al repositorio.
# Classes
SparkWebServer: servidor web simple que realiza diversas operaciones matemáticas y verifica si una cadena es un palíndromo, proporcionando los resultados correspondientes a través de solicitudes HTTP GET.
# Pre Requisitos
* Java: Es un lenguaje de programación de propósito general orientado a objetos, portátil y muy versátil.
  
* Maven: Es una herramienta que maneja el ciclo de vida del programa.
  
* Git: Es un sistema de control de versiones distribuido (VCS).
  
* Docker: Es un proyecto de código abierto que automatiza el despliegue de aplicaciones dentro de contenedores de software.


docker pull tankiandown/arep_lab05:latest
docker pull tankiandown/arep_lab05:latest
docker run -d -p 34000:6000 --name virtualizacion tankiandown/arep_lab05 
