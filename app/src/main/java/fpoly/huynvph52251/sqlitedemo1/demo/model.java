package fpoly.huynvph52251.sqlitedemo1.demo;

public class model {
    private String titel;
    private String des;

    public model(String titel, String des) {
        this.titel = titel;
        this.des = des;
    }

    public model() {
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
