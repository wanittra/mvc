package Models;

public class Cow {
    private String id;
    private String Cowage;
    private String Cowudder ;

    public Cow(String id, String age, String udder ) {
        this.id = id;
        this.Cowage = age;
        this.Cowudder = udder;
    }
    

    public String getId() {
        return this.id;
    }
    public String getCowAge() {
        return this.Cowage;
    }
    public String getCowudder(){
        return this.Cowudder;
    }
    // Setter สำหรับเปลี่ยนจำนวนเต้า
    public void setCowudder(String udder) {
        this.Cowudder = udder;
    }
}
