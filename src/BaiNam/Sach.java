package BaiNam;

public class Sach {
    private int idSach;
    private String tenSach;
    private String tenTacGia;

    public Sach() {
    }

    public Sach(int idSach, String tenSach, String tenTacGia) {
        this.idSach = idSach;
        this.tenSach = tenSach;
        this.tenTacGia = tenTacGia;
    }

    public int getIdSach() {
        return idSach;
    }

    public void setIdSach(int idSach) {
        this.idSach = idSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }
}
