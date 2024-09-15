package Controllers;

public class CheckId {
    public boolean validate(String id) {
        if (id.matches("\\d{8}") && !id.startsWith("0")) {
            return true;
        }
        return false;
    }
}
