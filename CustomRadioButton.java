
import javax.swing.*;
import javax.swing.plaf.FontUIResource;

import java.awt.*;

class CustomRadioButton extends JRadioButton {
    CustomRadioButton(String text) {
        setText(text);
        setFont(new FontUIResource("Calibri",Font.BOLD,16));
        setBackground(Color.white);
    }
}
