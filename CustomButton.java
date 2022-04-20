import javax.swing.*;
import javax.swing.plaf.*;
import java.awt.*;

class CustomButton extends JButton {
    CustomButton(String text) {
        setText(text);
        setBackground(new Color(0xe96a08));
        setForeground(new Color(0xffffff));
        setFocusable(false);
        setFont(new FontUIResource("Calibri", Font.BOLD, 16));
        setBorder(BorderFactory.createLineBorder(Color.white, 4));
    }
}
