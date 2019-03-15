import java.awt.*;
import javax.swing.*;

public class Aplikasi {

    static GraphicsConfiguration gc;

    public static void main(String[] args) {
        JFrame app = new JFrame(gc);
        app.setTitle("Test Jendela");
        app.setSize(300, 200);
        app.setVisible(true);
    }

}