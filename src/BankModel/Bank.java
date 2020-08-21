package BankModel;

public class Bank {
    private int id;
    private String tenNganHang;

    public String getTenNganHang() {
        return tenNganHang;
    }

    public void setTenNganHang(String tenNganHang) {
        this.tenNganHang = tenNganHang;
    }

//    public int getCurrentIndex() {
//        return currentIndex;
//    }
//
//    public void setCurrentIndex(int currentIndex) {
//        this.currentIndex = currentIndex;
//    }

//    private Customer[] customers; // cac nguoi dung trong ngan hang
//    private int currentIndex;

    public Bank() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public Customer[] getCustomers() {
//        return customers;
//    }
//
//    public void setCustomers(Customer[] customers) {
//        this.customers = customers;
//    }

}
