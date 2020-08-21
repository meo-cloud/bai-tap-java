package demoInterAbtrac;

public abstract class ConNguoi extends Object {
    private String cmnd;
    private String ten;
    private String diaChi;
    //........


    public ConNguoi() {
    }

    public ConNguoi(String cmnd, String ten, String diaChi) {
        this.cmnd = cmnd;
        this.ten = ten;
        this.diaChi = diaChi;
    }

    public String getCmnd() {
        return cmnd;
    }



    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public abstract void di();
}
