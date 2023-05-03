Feature: Selecionar producto

  Background:

    Given el usuario se encuentra en la pantalla exito
    When ingresa el usuario  selecionara una categoria
    And y seleciona una sub categoria



  @SelecionaP1
  Scenario: agregar al carrito
    Given el usuario seleciona  un producto
    And seleciona agragar al carrito
    And seleciona la cantidad