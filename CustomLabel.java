
import javax.swing.*;
import javax.swing.plaf.*;
import java.awt.*;

class CustomLabel extends JLabel {
    CustomLabel(String text) {
        setText(text);
        setFocusable(false);
        setFont(new FontUIResource("Calibri", Font.BOLD, 16));
    }
}
