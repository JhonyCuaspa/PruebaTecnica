#author: Jhony Cuaspa
#language: es

Característica: Inicio de sesion de usuario

  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion
 @test1
  Esquema del escenario: Validacion de campo obligatorio usuario
    Cuando intenta iniciar sesion sin ingresar usuario ni contrasena
    Entonces el sistema genera un mensaje indicando que el usuario es obligatorio "<campoUsuario>"

    Ejemplos:
      | campoUsuario        |
      | Epic sadface: Username is required  |
    @test1
  Esquema del escenario: Validacion de campo obligatorio contrasena
    Cuando ingresa usuario "<usuario>" pero no ingresa contrasena
    Entonces el sistema genera un mensaje indicando que la contrasena es obligatoria "<campoContrasena>"

    Ejemplos:
      | usuario         | campoContrasena  |
      | standard_user |Epic sadface: Password is required|