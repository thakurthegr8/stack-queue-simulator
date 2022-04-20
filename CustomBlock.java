
import javax.swing.*;
import javax.swing.plaf.FontUIResource;

import java.awt.*;

class CustomBlock extends JButton {
    CustomBlock(String text) {
        setText(text);
        setBackground(new Color(0x4d36bf));
        setForeground(new Color(0xffffff));
        setFocusable(false);
        setFont(new FontUIResource("Calibri", Font.BOLD, 14));
        setBorder(BorderFactory.createLineBorder(Color.white, 4));
    }
}
