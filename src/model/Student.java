package model;

public class Student {
    private int idSv;
    private String tenSv;
    private String ngaySinh;
    private String gioiTinh;
    private int idLop;
    private String tenKhoa;

    public Student(int idSv, String tenSv, String ngaySinh, String gioiTinh, int idLop, String tenKhoa) {
        this.idSv = idSv;
        this.tenSv = tenSv;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.idLop = idLop;
        this.tenKhoa = tenKhoa;
    }

//    private Student[] ds;

    public Student() {

    }

    public int getIdSv() {
        return idSv;
    }

    public void setIdSv(int idSv) {
        this.idSv = idSv;
    }

    public String getTenSv() {
        return tenSv;
    }

    public void setTenSv(String tenSv) {
        this.tenSv = tenSv;
    }



    @Override
    public String toString() {
        return "Student{" +
                "idSv=" + idSv +
                ", tenSv='" + tenSv + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", gioiTinh=" + gioiTinh +
                ", tenLop='" + idLop + '\'' +
                ", tenKhoa='" + tenKhoa + '\'' +
                '}';
    }
}
