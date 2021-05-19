1. Crear un json validando el formato en 

https://jsonformatter.curiousconcept.com/. El json debe contener los siguientes datos: 


- Nombre: Joan Matas
- Edad: 20
- Asignatura: Lenguajes de marcas
- Nota: 9
- Asignatura: Programación multimedia
- Nota: 8


2. Crear html con un formulario que disponga de un campo en el que pegar el texto del json y un botón "Enviar"


3. El botón "Enviar" del formulario debe enviar los datos a la URL http://127.0.0.1:8080/processJson


4. Crear un proyecto Spring-Boot que permita procesar la información recibida y guardarla en base de datos. Como respuesta, y para saber que los datos se han guardado bien, se debe responder con el id único asociado al elemento guardado.
(Ver link adjunto)

5. Crear un endpoint en el servicio generado en el punto anterior en el que se permita enviar un id y recuperar la entidad asociada a ese id (utilizar el método GET)
