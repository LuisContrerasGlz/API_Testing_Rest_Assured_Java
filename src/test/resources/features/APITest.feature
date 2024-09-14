# Definición de la funcionalidad que se está probando, en este caso, "Ejemplo API 1".
Feature: Ejemplo API 1
    # Escenario específico que describe una prueba particular. En este caso, se está probando una solicitud GET a un endpoint.
    Scenario: Prueba GET al endpoint      
        # Paso "Given" que indica que se va a enviar una solicitud GET al endpoint. Este paso está vinculado al método en la clase "APISteps".
        Given I send a get request to the endpoint
        # Paso "Then" que verifica que se ha recibido una lista de 10 usuarios como respuesta de la solicitud GET.
        Then I get a list of 10 users
