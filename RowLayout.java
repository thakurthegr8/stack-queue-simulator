
import javax.swing.*;
import java.awt.*;

public class RowLayout extends JPanel {
    RowLayout(JComponent... components) {
        setLayout(new GridLayout(1, components.length));
        setBorder(BorderFactory.createLineBorder(Color.white, 20));
        for (JComponent component : components) {
            add(component);
        }
    }
}
