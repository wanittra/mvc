package Controllers;
import Models.*;
import Views.*;

import javax.swing.JOptionPane;

public class CheckCoworGoat {
    public void check(String id) {
        Cow animal = Cowdata.getCowById(id);
        if (animal == null) {
            JOptionPane.showMessageDialog(null, "Animal ID not found!");
        } else if (animal.getCowAge() == null) {
            new ViewsGoat(animal);  // แสดงหน้าจอสำหรับแพะ
        } else {
            new ViewsCow(animal);  // แสดงหน้าจอสำหรับวัว
        }
    }
}
