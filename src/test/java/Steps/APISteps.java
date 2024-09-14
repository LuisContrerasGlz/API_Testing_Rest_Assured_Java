// Definición del paquete Steps
package Steps; 
// Importa la anotación @Given de Cucumber, usada para definir los pasos del tipo "Given" en los escenarios.
import io.cucumber.java.en.*;

// Definición de la clase APISteps, que contiene los métodos asociados a los pasos de las pruebas.
public class APISteps {
    // Definición de un paso "Given" que describe la acción de enviar una solicitud GET a un endpoint.
    @Given("^I send a get request to the endpoint$")
    public void sendGETRequest() {
        // Imprime, como prueba de fucionamiento aqui se ejecutarian las llamadas a la API.
        System.out.println("111111111- Sending GET request to the endpoint");
    }
    // Definición de otro paso "Given" que describe la acción de obtener una lista de 10 usuarios.
    //(\\d+) es una expresión regular que indica que se espera un número entero. por lo que el test correra con cualquier cantidad de usuarios.
    @Then("^I get a list of (\\d+) users$")
    public void sendRequest(int expectedUserSize) {
        // Imprime, como prueba de fucionamiento aqui se ejecutarian las llamadas a la API.
        System.out.println("2222222222- Sending another request to the endpoint");
    }
}
