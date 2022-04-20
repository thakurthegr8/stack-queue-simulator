import java.util.*;
import javax.swing.*;
import java.awt.*;

class Main extends JFrame {
    LinkedList<Integer> list;
    CustomRadioButton stack = new CustomRadioButton("Stack");
    CustomRadioButton queue = new CustomRadioButton("Queue");
    CustomButton stack_push = new CustomButton("Push");
    CustomButton stack_pop = new CustomButton("Pop");
    CustomButton queue_add = new CustomButton("Add");
    CustomButton queue_delete = new CustomButton("Delete");
    ButtonGroup btnGrp = new ButtonGroup();
    RowLayout VisualPanel = new RowLayout();
    MainPanel mainPanel = new MainPanel();

    Main() {
        // initialize list
        initList();
        // adds radio button in a group
        btnGrp.add(stack);
        btnGrp.add(queue);

        // frame settings
        setTitle("Stack and queue simulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640, 700);
        setVisible(true);
        add(mainPanel);

        // UI layout
        mainPanel.add(new ColumnLayout(VisualPanel));
        mainPanel.add(new Grid2ColLayout(
                new ColumnLayout(
                        new CustomLabel("Stack Operations"),
                        stack,
                        stack_push,
                        stack_pop),
                new ColumnLayout(
                        new CustomLabel("Queue Operations"),
                        queue,
                        queue_add,
                        queue_delete)));

        // Sets visualizer as a column
        stack.addActionListener(e -> {
            VisualPanel.setLayout(new GridLayout(list.size(), 1));
            VisualPanel.updateUI();

        });

        // Sets visualizer as a row
        queue.addActionListener(e -> {
            VisualPanel.setLayout(new GridLayout(1, list.size()));
            VisualPanel.updateUI();
        });

        // push element in a stack
        stack_push.addActionListener(e -> {
            if (stack.isSelected()) {
                if (list.size() == 10) {
                    JOptionPane.showMessageDialog(this, "Stack Overflow...");
                } else {

                    list.addLast(generateRandomNumbers());
                    VisualPanel.setLayout(new GridLayout(list.size(), 1));
                    updateAppUI();
                }

            } else {
                throwMessage("Stack is not selected...");
            }
        });

        // pops element from stack
        stack_pop.addActionListener(e -> {
            if (stack.isSelected()) {
                if (list.size() == 0) {
                    throwMessage("Stack Underflow...");
                } else {
                    list.removeLast();
                    VisualPanel.setLayout(new GridLayout(list.size(), 1));
                    updateAppUI();
                }
            } else {
                throwMessage("Stack is not selected...");
            }
        });

        // adds element in the queueu
        queue_add.addActionListener(e -> {
            if (queue.isSelected()) {
                if (list.size() == 10) {
                    JOptionPane.showMessageDialog(this, "Queue is full...");
                } else {
                    list.addFirst(generateRandomNumbers());
                    VisualPanel.setLayout(new GridLayout(1, list.size()));
                    updateAppUI();
                }
            } else {
                throwMessage("Queue is not selected...");
            }
        });

        // deletes element from the queue
        queue_delete.addActionListener(e -> {
            if (queue.isSelected()) {
                if (list.size() == 0) {
                    throwMessage("Queue is empty...");
                } else {
                    list.removeLast();
                    VisualPanel.setLayout(new GridLayout(1, list.size()));
                    updateAppUI();
                }
            } else {
                throwMessage("Queue is not selected...");
            }
        });
    }

    // generates random number
    int generateRandomNumbers() {
        Random randomNumbers = new Random();
        int newNum = randomNumbers.nextInt(100);
        return newNum;
    }

    // initialize list on first frame load
    void initList() {
        list = new LinkedList<Integer>();
        int count = 0;
        while (count != 10) {
            list.add(generateRandomNumbers());
            count++;
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            VisualPanel.add(new CustomBlock("" + list.get(i)));
        }
    }

    // updates app ui on every change on list
    void updateAppUI() {
        VisualPanel.removeAll();
        for (int i = list.size() - 1; i >= 0; i--) {
            VisualPanel.add(new CustomBlock("" + list.get(i)));
        }
        VisualPanel.updateUI();
    }

    // throws message
    void throwMessage(String text) {
        JOptionPane.showMessageDialog(this, text);
    }

    public static void main(String[] args) {
        new Main();
    }
}
