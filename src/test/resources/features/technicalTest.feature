# Author: Juan Camilo Ortiz Fajardo
@stories
Feature: Academy Choucair
As user, I want to automate in screenplay the process of registration at the Utest page
  @scenario1
  Scenario: Registration at the Utest Page
    Given that someone search for the Utest page in internet
    When he/she wants to register at the Utest Page
      |  nombre  |  apellido  |  correo  |  mes  |  dia  |  anio  |  contrasena  |
      | PrNombre | PrApellido | amilo@gmail.com | December |  10 | 2002 | Prueba123. |
    Then he/she joins to the Utest community
