package chua.bai;

import java.util.Scanner;

public class main {

    static  ClassRoomProcessor classRoomProcessor = new ClassRoomProcessor();
    public static void main(String[] args) {
        int choice = 0;
        while (choice != 8) {
            menu();
            choice = Integer.parseInt(new Scanner(System.in).nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Nhap vao vi tri :");
                    int viTri = Integer.parseInt(new Scanner(System.in).nextLine());
                    Student newStudent = new Student();
                    newStudent.createStudent();
                    classRoomProcessor.add(newStudent, viTri);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                default:
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("1. Them student");
        System.out.println("2. Remove student by id");
        System.out.println("3. Remove student by name");
        System.out.println("4. Search student by id");
        System.out.println("5. Search student by name");
        System.out.println("6. Sort student by id");
        System.out.println("7. Sort student by name");
        System.out.println("8. Exit");
        System.out.print("===========> Enter your choice : ");
    }
}
