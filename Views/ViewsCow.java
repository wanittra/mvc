package Views;
import Models.*;
import Controllers.*;

import javax.swing.*;

public class ViewsCow {
    public ViewsCow(Cow cow) {
        CowUdderChecker udderChecker = new CowUdderChecker();
        int milkProduced = 0;
        
        if (cow.getCowudder().equals("4")) {
            // รีดนมและตรวจสอบว่ามีโอกาสสูญเสียเต้าหรือไม่
            udderChecker.checkForUdderLoss(cow);
            milkProduced = udderChecker.calculateMilkProduction(cow);
            JOptionPane.showMessageDialog(null, "Milk produced: " + milkProduced + " liters.");
        } else {
            // ตรวจสอบโอกาสในการฟื้นตัวของเต้า
            udderChecker.checkForUdderRecovery(cow);
            JOptionPane.showMessageDialog(null, "Cannot milk cow with 3 udders.");
        }
        
        // กลับไปยังหน้าจอรับรหัสหลัก
        ViewsMain mainView = new ViewsMain();
        mainView.Show();
    }
    
}