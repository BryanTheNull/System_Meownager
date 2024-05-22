package Config;

import View.EntrySystem.Login;
import com.formdev.flatlaf.FlatLightLaf;

/**
 * @author bv587
 */

public class Main {
    public static void main(String[] args) {
        FlatLightLaf.setup();
        Login login = new Login();
        login.setVisible(true);
    }
}
