
import javax.swing.*;
import java.awt.*;

public class Grid2ColLayout extends JPanel {
    Grid2ColLayout(JComponent... components) {
        setLayout(new GridLayout(1, 2));
        setBackground(Color.white);
        for (JComponent component : components) {
            add(component);
        }
    }
}
