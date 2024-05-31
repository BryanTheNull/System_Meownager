package View.EntrySystem;

import org.assertj.swing.core.BasicRobot;
import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginTest {

    private FrameFixture window;

    @BeforeEach
    void setUp() {
        // Inicia la interfaz de Login antes de cada prueba
        Login frame = GuiActionRunner.execute(Login::new);
        window = new FrameFixture(BasicRobot.robotWithNewAwtHierarchy(), frame);
        window.show(); // Muestra el frame para las pruebas
    }

    @AfterEach
    void tearDown() {
        // Limpia los recursos después de cada prueba
        window.cleanUp();
    }

    @Test
    void estadoInicialComponetes() {
        // Revisar el nombre del componente en la interfaz gráfica
        // Asegurarse de que el nombre coincide exactamente
        window.textBox("Login_txtEmail").requireText("Email");        
    }
}
