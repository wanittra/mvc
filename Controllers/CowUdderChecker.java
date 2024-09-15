package Controllers;
import Models.*;

import java.util.Random;

public class CowUdderChecker {
    private Random random = new Random();

    // ฟังก์ชันสำหรับตรวจสอบโอกาสที่วัวจะสูญเสียเต้าหลังจากรีดนม
    public void checkForUdderLoss(Cow cow) {
        if (cow.getCowudder().equals("4")) {
            System.out.println("Milking cow with 4 udders...");
            // มีโอกาส 5% ที่จะสูญเสีย 1 เต้า
            if (random.nextInt(100) < 5) {
                System.out.println("Udder lost! Now the cow has 3 udders.");
                cow.setCowudder("3");
            } else {
                System.out.println("Cow was milked successfully without losing an udder.");
            }
        }
    }

    // ฟังก์ชันสำหรับตรวจสอบโอกาสที่วัวจะกลับมามีเต้าครบ 4 เต้า
    public void checkForUdderRecovery(Cow cow) {
        if (cow.getCowudder().equals("3")) {
            System.out.println("Cow with 3 udders...");
            // มีโอกาส 20% ที่จะฟื้นตัวกลับมาเป็นวัว 4 เต้า
            if (random.nextInt(100) < 20) {
                System.out.println("Udder recovered! Now the cow has 4 udders.");
                cow.setCowudder("4");
            } else {
                System.out.println("No recovery. The cow still has 3 udders.");
            }
        }
    }

    // ฟังก์ชันสำหรับคำนวณน้ำนมจากอายุของวัว
    public int calculateMilkProduction(Cow cow) {
        String[] ageParts = cow.getCowAge().split(" years, | months");
        int years = Integer.parseInt(ageParts[0]);
        int months = Integer.parseInt(ageParts[1]);
        return years + months;  // จำนวนปี + เดือนเป็นลิตร
    }
}
