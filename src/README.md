
## Práctica # 2: Formato json.

El proyecto consiste en crear un registro de mascotas para la veterinaria
**"El Borrego Viudo"**.

Cada dueño debe registrar sus datos básicos: Nombre, edad, número de teléfono
y dirección. El dueño podrá registrar a cada una de sus mascotas.

Los datos básicos de cada mascota son su nombre, tipo, número de identificación
y fecha de nacimiento. Obviamente, dependiendo del tipo de mascota, se deberán 
registrar datos adicionales. Por lo pronto, se requieren al menos los siguientes
tipos:

+ Gatos: Si están o no esterilizados
+ Perros: Su raza

Para cada una de las mascotas, el dueño podrá agendar citas. Para ello deberá
registrar la fecha de la cita (la cual *obviamente* debe ser en el futuro), y 
el motivo de la misma.

    1) Modele las clases correspondientes. Considere cuántas mascotas puede tener
    un dueño, y cuántas citas puede tener una mascota
    2) Agregue las librerías necesarias para poder imprimir los datos en formato 
    json
    3) Implemente al menos dos métodos en cada clase: el método que lea los datos
    desde teclado, y el método que imprima los datos en formato json
    4) Complete la lógica de main. El programa deberá soportar al menos todas las 
    opciones del menú, y no lanzar errores.

