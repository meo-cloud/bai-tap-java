package core;

import model.ClassRoom;
import model.Student;

import java.util.*;

public class Main {
    static LinkedList<Student> classRoom = new LinkedList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create a Scanner object
//        // Tao 1 LinkedList chua tat ca classrom
//        LinkedList<LinkedList<Student>> university = new LinkedList<>();

        // Tao va add san 2 sv vao list
        Student svNam = new Student(1, "Nam", "20/07", "Nam", 1, "K50");
        Student svHoang = new Student(2, "Hoang", "05/06", "Nam", 1, "K50");

        classRoom.add(svNam);
        classRoom.add(svHoang);

        // Them sv qua input
        System.out.println("ID: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("Ten: ");
        String tenSv = input.nextLine();
        System.out.println("Ngay Sinh: ");
        String ngaySinh = input.nextLine();
        System.out.println("Gioi Tinh: ");
        String gioiTinh = input.nextLine();
        System.out.println("ID Lop: ");
        int idLop = input.nextInt();
        input.nextLine();
        System.out.println("Ten Khoa: ");
        String tenKhoa = input.nextLine();

        Student svMoi = new Student(id, tenSv, ngaySinh, gioiTinh, idLop, tenKhoa);
        classRoom.add(svMoi);

        // Hien so sv trong list hien tai
        System.out.print("So SV trong lop: ");
        System.out.println(classRoom.size());

        // Tim sv theo ten hoac ID - van chua hoan thien tot
        String nhapVaoTenId;
        System.out.println("Nhan 1 de chon tim theo MSSV, 2 de chon tim theo ten: ");
        int luaChon = input.nextInt();
        switch (luaChon) {
            case 1:
                System.out.println("Dien ten: ");
                nhapVaoTenId = input.nextLine();
                timSvTheoTen(nhapVaoTenId);
                break;
            case 2:
                System.out.println("Dien MSSV: ");
                nhapVaoTenId = input.nextLine();
                timSvTheoId(Integer.parseInt(nhapVaoTenId));
                break;
            default:
                System.out.println("Dien sai");
                break;
        }

//        System.out.println("Dien ten: ");
//        nhapVaoTen = input.nextLine();
//        timSvTheoTen(nhapVaoTen);
//        timSvTheoId(Integer.parseInt(intnhapVaoMssv));

        // In sv trong list ra nao
        for (Student sv : classRoom) {
            System.out.println(sv);
        }

//        try {
//            int nhapID = Integer.parseInt(tenSv);
//            timSvTheoId(nhapID);
//        } catch (Exception a) {
//            System.out.println(a);
//            timSvTheoTen(tenSv);
//        }


        // Viet doan code nhap t ban phim thong day du 1 class hoac 1 student -> tim trong danh sach (list) -> neu co thi update lai -> neu khong co thi in ra thong bao
    }


    public static void remove(int mssv) {
        var isFound = false;
        for (int i = 0; i < classRoom.size(); i++) {
            var foundedSinhVien = classRoom.get(i);
            if (foundedSinhVien.getIdSv() == mssv) {
                isFound = true;
                classRoom.remove(foundedSinhVien);
            }
        }
        if (isFound) {
            System.out.println("Da xoa duoc sinh vien");
        } else {
            System.out.println("Khong co sinh vien nao de xoa");
        }
    }

    public static void timSvTheoId(int id) {
//        int a = Integer.parseInt(id);
        for (int i = 0; i < classRoom.size(); i++) {
            if (classRoom.get(i).getIdSv() == (int) id) {
                System.out.println("tim thay theo id");
            } else System.out.println("cha thay gi");
        }
    }

    public static void timSvTheoTen(String name) {
        for (int i = 0; i < classRoom.size(); i++) {
            if (classRoom.get(i).getTenSv().equalsIgnoreCase(name)) {
                System.out.println("tim thay theo ten");
            } else System.out.println("cha thay gi a"); // dang bi double
        }
    }

//    public static void timSv(Class<?> id) {
////        int a = Integer.parseInt(id);
//        if (id == String.class){
//            for (int i = 0; i < classRoom.size(); i++) {
//                if (classRoom.get(i).getTenSv().equals(id.toString())){
//                    System.out.println("tim ra theo ten");
//                } else System.out.println("khong tim ra theo ten");
//            }
//        } else if (id == int.class){
//            for (int i = 0; i < classRoom.size(); i++) {
//                if (classRoom.get(i).getIdSv() == id){
//                    System.out.println("tim ra theo id");
//                } else
//                System.out.println("khong tim ra theo id");
//            }
//        }
//
//    }
}

//
//    private static void accept(Customer m) {
//        System.out.println(m.getId());
//    }
//
//    public static void main2(String[] args) {
//
//        Bank nganHangA = new Bank();
//        nganHangA.setId(1);
//        nganHangA.setTenNganHang("Ngan hang A");
//
//        Bank nganHangB = new Bank();
//        nganHangB.setId(2);
//        nganHangB.setTenNganHang("Ngan hang B");
//
//        Bank nganHangC = new Bank();
//        nganHangC.setId(3);
//        nganHangC.setTenNganHang("Ngan hang C");
////        Customer cusCuaNganHangA = new Customer();
////        cusCuaNganHangA.setIdNganHang(1);
//
//        Stack stack = new Stack();
////        stack.push(nganHangA);
////        stack.pop();
//        LinkedList<Bank> library = new LinkedList<>(); // generic
//
//        library.add(nganHangA);
//        library.add(nganHangB);
//        ArrayList nganHangsArr = new ArrayList();
//        LinkedList nganHangs = new LinkedList(); // Tao ra 1 storage de luu du lieu
//
//        nganHangs.add(nganHangA);
//
//        for (int i = 0; i < nganHangs.size(); i++) {
//            var b = (Bank) nganHangs.get(i);
//            System.out.println(b.getId());
//            System.out.println(b.getTenNganHang());
//        }
//        nganHangs.remove(nganHangA);
//        System.out.println("=======================");
//        for (int i = 0; i < nganHangs.size(); i++) {
//            var b = (Bank) nganHangs.get(i);
//            System.out.println(b.getId());
//            System.out.println(b.getTenNganHang());
//        }
////        Bank[] nganHangs = new Bank[1000];
//
//        SinhVien sv = new SinhVien();
//        CongNhan cn = new CongNhan();
////        library.add(sv);
//        Stack<Bank> stackBank = new Stack<>();
//        stack.push(nganHangA);
//        Bank bbbb = (Bank) stack.pop();
//        stack.empty();
//        int aaaa = stack.search(nganHangA);
//        sv.getClass();
//
////        Queue<Bank> bankQueue = new Queue<Bank>() {
////        }
//        ArrayDeque<Bank> arrayDeque = new ArrayDeque<>();
////        cn.di();
////        sv.di();
////        sv.getTen();
//
////        var dsCus = nganHang.getCustomers(); // Gia su la dang co khach hang
////        var khDauTien = dsCus[0]; // lay duoc luon khach hang dau tien
////        var khThuHai = dsCus[1];
////        khThuHai.setTenNganHang("Ngan hang C");
////        khDauTien.setTenNganHang("Ngan hang B");
//
//
////        ArrayList<Student> dsSinhVien = new ArrayList<>();
////        dsSinhVien.add(new Student(1,"Dung","1990",'M',"IT","AK47"));
////
////        for (Student e: dsSinhVien) {
////            System.out.println(e);
////        }
////    studentList.addStudent(new Student(1,"Dung","2020",'M',"IT","AK47"));
////    studentList.addStudent(new Student(2,"Nguyen","2021",'M',"IT","AK47"));




