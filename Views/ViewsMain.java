package Views;
import Controllers.*;
import Models.Cowdata;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewsMain {
    private JFrame frame;
    private JTextField textField;

    public void Show() {
        Cowdata.setPredefinedCowData();
        frame = new JFrame("Milking Machine");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        
        frame.setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);
        
        JLabel userLabel = new JLabel("Enter Animal ID:");
        userLabel.setBounds(10, 20, 160, 25);
        panel.add(userLabel);

        textField = new JTextField(20);
        textField.setBounds(180, 20, 165, 25);
        panel.add(textField);

        JButton loginButton = new JButton("Submit");
        loginButton.setBounds(180, 80, 80, 25);
        panel.add(loginButton);
        
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = textField.getText();
                CheckId checkId = new CheckId();
                if (checkId.validate(id)) {
                    CheckCoworGoat checker = new CheckCoworGoat();
                    checker.check(id);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid ID Format!");
                }
            }
        });
    }
}
