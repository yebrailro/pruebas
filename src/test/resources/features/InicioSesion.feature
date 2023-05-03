@InicioTest

Feature: Inicio de Sesion

  
  Scenario: Title of your scenario
  Given el usuario se encuentra en la pantalla Login de Garantias
    When ingresa el usuario de red "iparada@banbogota.com.co" y la clave "Bogota123*"
    And selecciona el dominio correcto
    And presiona el boton Ingresar
    Then se debe visualizar la pantalla HomePage
    
    
     Examples: 
      | usuarioDeRed             | clave         |
      | usuarioInvalido          | Bogota123*    |
