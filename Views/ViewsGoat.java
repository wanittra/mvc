package Views;
import Models.*;

import javax.swing.*;

public class ViewsGoat {
    public ViewsGoat(Cow goat) {
        JFrame frame = new JFrame("Goat Handler");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel, goat);
        
        frame.setVisible(true);
    }

    private void placeComponents(JPanel panel, Cow goat) {
        panel.setLayout(null);

        JLabel label = new JLabel("Goat ID: " + goat.getId());
        label.setBounds(10, 20, 250, 25);
        panel.add(label);

        JButton button = new JButton("Send Goat to the Mountain");
        button.setBounds(10, 50, 200, 25);
        panel.add(button);

        // ปิดหน้าต่างหลักหลังจากกดปุ่ม
        button.addActionListener(e -> {
            JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(panel);
            if (currentFrame != null) {
                currentFrame.dispose(); // ปิดหน้าต่างปัจจุบัน
            }
            new ViewsMain().Show(); // เปิดหน้าต่างหลักใหม่
        });
    }
}
