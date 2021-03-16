package runner;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefsTodo {
    @Given("yo tengo abierto mi aplicacion todo")
    public void yoTengoAbiertoMiAplicacionTodo() {
    }

    @When("yo hago click en el boton {string}")
    public void yoHagoClickEnElBoton(String nombreControl) {
    }

    @And("yo lleno la caja de texto {} con el valor {string}")
    public void yoLlenoLaCajaDeTextoTituloConElValor(String control,String value) {
    }

    @Then("la nota {string} deberia ser mostrado")
    public void laNotaDeberiaSerMostrado(String expectedResult) {
    }
}
