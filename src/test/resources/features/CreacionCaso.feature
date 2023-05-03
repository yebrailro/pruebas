
Feature: crear nuevo caso

Background: 
    Given el usuario se encuentra en la pantalla Login de Garantias
    And ingresa el usuario de red "iparada@banbogota.com.co" y la clave "Bogota123*"
    And selecciona el dominio correcto
    And presiona el boton Ingresar
    And se debe visualizar la pantalla HomePage
    


  @CrearCaso
  Scenario: crear caso
    Given el usuario seleciona  el boton crear caso
    And seleciona el tipo de documento
  	Then el usuario ingresa su documento
  	Then el usuario ingresa el tipo de credito
  	And  el usuario seleciona el producto bancario
    Then el usuario ingresa el numero de la garantia
    And  el usuario da click en el boton guardar


