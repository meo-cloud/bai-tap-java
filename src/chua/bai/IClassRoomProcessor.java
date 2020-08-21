package chua.bai;

import java.util.ArrayList;

public interface IClassRoomProcessor {
    Student add(Student student, int index); // return ra object => thanh cong, null => add failed
    boolean removeById(int mssv);
    boolean removeByIndex(int index);
    Student searchById(int mssv);
    ArrayList<Student> searchByName(String name);
    void sortById();
    void sortByName();
}
