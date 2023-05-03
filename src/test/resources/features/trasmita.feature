

Feature: trasmitar solicitud


	Background: 
    Given el usuario se encuentra en la pantalla Login de Garantias
    And ingresa el usuario de red "iparada@banbogota.com.co" y la clave "Bogota123*"
    And selecciona el dominio correcto
    And presiona el boton Ingresar
    And se debe visualizar la pantalla HomePage
    
    
   @tramiTest
  Scenario: seleciona el desembolso
    And el Ejecutivo selecciona el registro a tramitar
    And visualiza la informacion del caso seleccionado
    And el Ejecutivo da click en ngresa el numero de garantia
    And da click en el boton Guardar
    And da click en el boton Regresar
    Then el usuario puede visualizar y observar el cambio de estado 

  
 
