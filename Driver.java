import javax.swing.*;
import java.awt.*;

public class Driver {
    private JFormattedTextField textField;
    public Driver(){
        JFrame frame = new JFrame();
        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel panel = new JPanel(new BorderLayout());
        Listener listener = new Listener(this);

        mainPanel.add(panel, BorderLayout.NORTH);
        textField = new JFormattedTextField(java.text.NumberFormat.getIntegerInstance());
        textField.addActionListener(listener);
        panel.add(textField);
        panel.add(new JLabel("Input timer"), BorderLayout.SOUTH);
        JButton button = new JButton();
        mainPanel.add(button, BorderLayout.CENTER);
        button.addActionListener(listener);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(mainPanel);
        frame.setVisible(true);
    }

    public int getValue(){
        if(textField.getValue() != null){
            return Integer.parseInt(textField.getValue().toString());
        }else{
            return -1;
        }

    }
}
