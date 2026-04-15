#author: Jhony Cuaspa
#language: es

Característica: Inicio de sesion

  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion
    @test1
   Esquema del escenario: Inicio de sesion fallido por contrasena incorrecta
    Cuando ingresa un usuario valido "<usuario>" y una contrasena incorrecta "<contrasena>"
    Entonces el sistema genera un mensaje de error "<mensaje>"

     Ejemplos:
       | usuario        | contrasena   | mensaje |
       | standard_user  | setret_dfuce | Epic sadface: Username and password do not match any user in this service |
