# 📦 Sistema de Inventario - Multicolor

Este proyecto corresponde a una aplicación Java desarrollada para gestionar el almacén de refacciones de la empresa Multicolor. Provee herramientas para realizar altas y bajas de artículos, análisis de rotación, alertas de bajo stock y gestión de ubicación física en el almacén.


Descripción

Sistema de inventario multiplataforma desarrollado en Java para uso interno de la empresa Multicolor. Permite la administración de refacciones mediante una consola interactiva para operaciones CRUD, análisis y alertas automatizadas.


Problema Identificado

El almacén de refacciones operaba sin una gestión digital eficiente, dificultando el seguimiento de stock, ubicaciones físicas, y detectando a destiempo las piezas con baja rotación o bajo nivel de existencia.


Solución

Se desarrolla un sistema Java autónomo que:
- Administra entradas y salidas de inventario.
- Analiza rotación de artículos.
- Notifica sobre bajo stock.
- Permite asignar ubicación física a cada pieza.


Arquitectura

+----------------+ | Usuario CLI | +--------+-------+ | v +--------+-------+ | Main.java | <-- Entrada del sistema +--------+-------+ | v +--------+-------+ +--------------------+ | Inventario.java |<--->| Articulo.java | +------------------+

Tabla de Contenidos

- [Descripción](#-descripción)
- [Problema Identificado](#-problema-identificado)
- [Solución](#-solución)
- [Arquitectura](#-arquitectura)
- [Requerimientos](#-requerimientos)
- [Instalación](#-instalación)
- [Configuración](#-configuración)
- [Uso](#-uso)
- [Contribución](#-contribución)
- [Roadmap](#-roadmap)

Requerimientos

Software
- Java Development Kit (JDK) 17 o superior
- Visual Studio Code (con Java Extension Pack)
- Git
- (Opcional) Docker para despliegue
- (Opcional) Heroku CLI para producción en la nube

Paquetes Adicionales
- No requiere librerías externas en su versión básica.


Instalación

Instalar ambiente de desarrollo

# Clonar repositorio
git clone https://github.com/OscarHuerta1997/almacen-refacciones-multicolor.git

# Compilar código
javac src/*.java

# Ejecutar
java -cp src Main

Ejecutar pruebas manualmente
Actualmente no se cuenta con pruebas automatizadas. Para pruebas manuales:
Ejecuta la aplicación desde consola.
Usa las opciones del menú para agregar, eliminar o visualizar artículos.
Simula un bajo stock para verificar alertas.

Implementación en producción local (sin servidor):

Compilar el proyecto.

Ejecutar como aplicación de consola.

Configuración
-Archivos de configuración
No se requieren archivos .properties en esta versión.

Configuración embebida (valores por defecto y rutas internas).

-Requerimientos configurables
Nivel de alerta por stock bajo (valor umbral ajustable en código).

Almacén virtual: se pueden agregar ubicaciones personalizadas.

Manual del Usuario Final
Al ejecutar la aplicación, se muestra un menú por consola.

Navega por las opciones:

Agregar artículo
Eliminar artículo
Mostrar inventario
Ver alertas de stock bajo
Consultar rotación

Manual del Administrador
Puede modificar directamente el código fuente para ajustar valores de stock mínimo.
Administrar versión, pruebas y despliegue.

Roadmap
Funcionalidades futuras planeadas:

Interfaz gráfica con JavaFX o Swing
Base de datos SQLite para persistencia
API REST para acceso remoto
Módulo de autenticación para administradores
Informes automáticos en PDF o Excel