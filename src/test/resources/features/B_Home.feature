#Author: Jefferson Parra Ariza
#Email: jparr37@bancodebogota.com.co
@RegresionHome
Feature: Home
  Validacion de interacciones en el home de la aplicacion

  Background: 
    Given que ingreso a la pagina web de la aplicacion
    When diligencio el usuario de red "jparr37" clave de red "Bogota123*" y dominio
    Then deberia visualizar el home

  @HomeAprobacionAgil
  Scenario: Seleccion aprobacion agil exitoso
    When selecciono el boton de Aprobacion agil
    Then marcacion caso de prueba en testlink HomeAprobacionAgil "HomeAprobacionAgil"
    Then deberia visualizar el texto Hola Gerente Pyme bienvenido

  @HomeFirmaElectronica
  Scenario: Seleccion firma electronica exitoso
    When selecciono el boton de Firma electronica
    Then marcacion caso de prueba en testlink HomeFirmaElectronica "HomeFirmaElectronica"
    Then deberia visualizar el texto Crear nuevo desembolso

  @HomeModalCierreDeSesion
  Scenario: Visualizacion modal cierre de sesion
    When selecciono el boton de Cerrar sesion del header
    Then deberia visualizar el modal de Cierre de sesion

  @HomeModalCierreDeSesionCancelar
  Scenario: Seleccion boton Cancelar modal cierre de sesion 
    When selecciono el boton de Cerrar sesion del header
    When selecciono el boton de Cancelar del modal de cierre de sesion
    Then deberia visualizar el home

  @HomeModalCierreDeSesionCerrar
  Scenario: Seleccion boton Cerrar modal cierre de sesion 
    When selecciono el boton de Cerrar sesion del header
    When selecciono el boton de Cerrar del modal de cierre de sesion
    Then deberia visualizar el home

  @HomeModalCierreDeSesionConfirmar
  Scenario: Seleccion boton Confirmar modal cierre de sesion
    When selecciono el boton de Cerrar sesion del header
    When selecciono el boton de Confirmar del modal de cierre de sesion
    Then deberia visualizar el inicio de sesion

  @HomeModalInactividadIniciarSesion
  Scenario: Visualizacion modal inactividad y seleccion boton iniciar sesion
    When espero unos minutos en la pantalla
    Then deberia visualizar el modal de inactividad con el texto "Su sesión ha caducado por inactividad"
    When selecciono el boton de iniciar sesion del modal de inactividad
    Then deberia visualizar el inicio de sesion
