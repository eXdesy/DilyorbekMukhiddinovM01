# Repositorio DilyorbekMukhiddinovM01
Este proyecto de Android Studio aloja una aplicación simple que proporciona una experiencia de inicio de sesión segura seguida de un contador con tres funciones esenciales. El objetivo principal de la aplicación es ofrecer una funcionalidad básica para gestionar un contador, permitiendo a los usuarios incrementar, decrementar y reiniciar su valor.

***

## EJERCICIO 01
Deberás recrear en android la aplicación del contador que se os proporciona. El diseño se os pasará por figma (abajo teneis el enlace). En este primer ejercicio solo debes hacer la parte visual, nada de lógica. Asegurate de que el resultado final sea identico al proporcionado, en tu criterio queda elegir el o los tipos de layouts que utilizarás. Mediante figma obtén el tipo de fuente, colores etc que debes utilizar en tu aplicación.

**[EjerciciosAndroid](https://www.figma.com/file/81Q9MRTXxY0lega1H7OPwr/EjeciciosAndroid?type=design&node-id=0%3A1&mode=design&t=QnfFnLzeeeTieqMl-1)**

![DilyorbekMukhiddinovM01_contador](https://github.com/eXdesy/DilyorbekMukhiddinovM01/blob/main/img/DilyorbekMukhiddinovM01_contador.png)

Fue creada una aplicación Android con una interfaz que incluye un contador numérico y botones para incrementar, decrementar y reiniciar dicho contador. La lógica de la aplicación es simple: al hacer clic en el botón "+" se incrementa el contador, al hacer clic en el botón "-" se decrementa el contador (si es mayor que cero), y al hacer clic en el botón "Reset" se restablece el contador a cero. El valor actual del contador se muestra en un `TextView` en la interfaz de usuario.

***

## EJERCICIO 02
Crea la segunda pantalla en el mismo proyecto(investiga como). Deberás realizar un lógin tal y como se muestra en el figma, en el caso de que el usuario y contraseña sean `admin` en el TextView de abajo saldrá “Usuario y contraseña correcta” en caso contrario “Usuario o contraseña incorrecta”. Investigar por vuestra cuenta como iniciar la aplicación en la Activity login. Pista → se configura en el `AndroidManifest.xml`. Una vez que iniciemos el login deberá pasar a la pantalla del contador pasando el dato del nombre del usuario (aparecerá en la parte baja de la pantalla de contador donde ponía “by nombre_alumno”).

**[EjerciciosAndroid](https://www.figma.com/file/81Q9MRTXxY0lega1H7OPwr/EjeciciosAndroid?type=design&node-id=237%3A2&mode=design&t=pCKmiNAN91TSCUXT-1)**

![DilyorbekMukhiddinovM01_login](https://github.com/eXdesy/DilyorbekMukhiddinovM01/blob/main/img/DilyorbekMukhiddinovM01_login.png)

Fue creada una ventana de inicio de sesion de la aplicacion. Al ejecutar la aplicación, los usuarios ingresan un nombre de usuario y una contraseña. Si ambos coinciden con "admin", se redirige a los usuarios a la actividad principal (`MainActivity`); de lo contrario, se muestra un mensaje de error mediante un Toast, indicando que el nombre de usuario o la contraseña son incorrectos.

***

## ¡Disfruta de la aplicación de contador simple!



