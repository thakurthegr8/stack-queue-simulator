import javax.swing.*;
import java.awt.*;

public class ColumnLayout extends JPanel {
    ColumnLayout(JComponent... components) {
        setLayout(new GridLayout(components.length, 1, 4, 4));
        setBackground(Color.white);
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        for (JComponent component : components) {
            add(component);
        }
    }
}
