#author: Jhony Cuaspa
#language: es

Característica: Inicio de sesion

  @test1
  Esquema del escenario: Inicio de sesion exitoso con credenciales validas
    Dado que el usuario se encuentra en la pagina de inicio de sesion
    Cuando ingresa el usuario "<usuario>" y la contrasena "<contrasena>"
    Entonces el usuario ingresa a la pagina principal "<titulo>" "<subtitulo>"

    Ejemplos:
      | usuario        | contrasena   | titulo | subtitulo |
      | standard_user  | secret_sauce | Swag Labs | Products|
