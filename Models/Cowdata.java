package Models;

import java.util.ArrayList;
import java.util.List;

public class Cowdata{
    private static List<Cow> Cows = new ArrayList<>();

    // ฟังก์ชันสำหรับตั้งค่าข้อมูลวัวที่กำหนดล่วงหน้า
    public static void setPredefinedCowData() {
        Cows.add(new Cow("12345678",  "2 years, 5 months","4"));
        Cows.add(new Cow("23456789",  "3 years, 10 months","3"));
        Cows.add(new Cow("34567890",  "5 years, 8 months","3"));
        Cows.add(new Cow("45678901", "7 years, 1 months","4"));
        Cows.add(new Cow("16789012",   null,null)); // Goat
        Cows.add(new Cow("56789012",  "0 years, 9 months","3"));
        Cows.add(new Cow("67890123",  "10 years, 0 months","4"));
        Cows.add(new Cow("78901234",  "6 years, 4 months","4"));
        Cows.add(new Cow("89012345",  "4 years, 3 months","3"));
        Cows.add(new Cow("90123456",  "9 years, 11 months","4"));
        Cows.add(new Cow("91234567",  "1 years, 2 months","4"));
        Cows.add(new Cow("82345678",  "8 years, 6 months","4"));
        Cows.add(new Cow("73456789",  "0 years, 7 months","3"));
        Cows.add(new Cow("64567890",  "5 years, 5 months","3"));
        Cows.add(new Cow("55678901",  "2 years, 1 months","3"));
        Cows.add(new Cow("46789012",  "3 years, 2 months","3"));
        Cows.add(new Cow("26789012",  null,null)); // Goat
    }
    public static Cow getCowById(String id) {
        for (Cow cow : Cows) {
            if (cow.getId().equals(id)) {
                return cow;
            }
        }
        return null;
    }
}
