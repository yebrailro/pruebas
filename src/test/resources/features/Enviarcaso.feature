

Feature: enviar caso a bandeja mis casos


	Background: 
    Given el usuario se encuentra en la pantalla Login de Garantias
    And ingresa el usuario de red "iparada@banbogota.com.co" y la clave "Bogota123*"
    And selecciona el dominio correcto
    And presiona el boton Ingresar
    And se debe visualizar la pantalla HomePage
    And el Ejecutivo selecciona el registro a tramitar
    And visualiza la informacion del caso seleccionado
    And el Ejecutivo da click en ngresa el numero de garantia
    And da click en el boton Guardar
    And da click en el boton Regresar
    Then el usuario puede visualizar y observar el cambio de estado 
    
  @EnviarTest
  Scenario: selecionar caso a enviar
    Given el usuario seleciona los casos a enviar
    And ingresa el numero de precinto
  	Then el usuario da click en el boton enviar
  	And  el usuario seleciona la bandeja mis casos enviados
    Then el usuario puede visualizar la bandeja de casos enviados
   
