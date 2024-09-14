// Este paquete contiene la clase Runner, que es responsable de ejecutar las pruebas de Cucumber.
package Runner; 
// Importa la anotación @RunWith que le indica a JUnit qué clase debe usar para ejecutar las pruebas.
import org.junit.runner.RunWith; 
// Importa la clase Cucumber que es usada para integrar Cucumber con JUnit, para que Cucumber ejecute los escenarios definidos en los archivos .feature.
import io.cucumber.junit.Cucumber; 
// Importa la anotación @CucumberOptions que permite configurar Cucumber, especificando opciones como la ubicación de los archivos de características y los pasos.
import io.cucumber.junit.CucumberOptions; 
// Esta anotación indica que esta clase va a usar Cucumber como el "runner" (ejecutor de pruebas) y que las pruebas serán ejecutadas usando Cucumber y JUnit.
@RunWith(Cucumber.class) 
//@CucumberOptions que permite configurar Cucumber, especificando opciones como la ubicación de los archivos de características y los pasos.
@CucumberOptions(
    // La opción "features" indica la ruta donde se encuentran los archivos .feature. En este caso, están en "src/test/resources/Features".
    features = "src/test/resources/Features",    
    // La opción "glue" indica la ruta donde están definidas las clases con los pasos (step definitions) correspondientes a los escenarios definidos en los archivos .feature. En este caso, están en el paquete "Steps".    
    glue = "Steps" 
) 
// Clase Runner que se encarga de ejecutar las pruebas de Cucumber. No necesita tener ningún método adicional ya que las anotaciones @RunWith y @CucumberOptions son suficientes para ejecutar las pruebas.
public class Runner { 
    
}

