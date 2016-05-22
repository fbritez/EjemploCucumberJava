Feature: Extraccion de dinero
Como usuario
quiero extraer dinero


Scenario: Extraccion con exito
	Given Cuando hay un cajero con $10 
	When saco $10
	Then el cajero queda vacio