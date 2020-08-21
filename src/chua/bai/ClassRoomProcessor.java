package chua.bai;

import java.util.ArrayList;
import java.util.function.Predicate;

public class ClassRoomProcessor implements IClassRoomProcessor {
    private ArrayList<Student> classRoom = null;

    public ClassRoomProcessor() {
        classRoom = new ArrayList<>();
    }

    public ArrayList<Student> getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ArrayList<Student> classRoom) {
        this.classRoom = classRoom;
    }


    @Override
    public Student add(Student student, int index) {
        this.classRoom.add(index, student);
        return student;
    }

    @Override
    public boolean removeById(int mssv) {
//        this.classRoom.removeIf(new Predicate<Student>() {
//            @Override
//            public boolean test(Student student) {
//                return student.getId() == mssv;
//            }
//        });
        boolean isRemove = false;
        for (Student sv : this.classRoom) {
            if (sv.getId() == mssv) {
                isRemove = true;
                this.classRoom.remove(sv);
            }
        }
        return isRemove;
    }

    @Override
    public boolean removeByIndex(int index) {
        Student student = this.classRoom.remove(index);
        if (student != null) return  true;
        return false;
    }

    @Override
    public Student searchById(int mssv) {
        for (Student sv : this.classRoom) {
            if (sv.getId() == mssv) {
                return sv;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Student> searchByName(String name) {
        ArrayList<Student> foundedStudent = new ArrayList<>();

        for (Student sv : this.classRoom) {
            if (sv.getName().equals(name)) {
                foundedStudent.add(sv);
            }
        }

        return foundedStudent; //check la foundedStudent.empty()
    }

    @Override
    public void sortById() {
        for (int i = 0; i < this.classRoom.size(); i++) {
            for (int j = 0; j < this.classRoom.size(); j++) {
                if (this.classRoom.get(i).getId() > this.classRoom.get(j).getId()) {
                    Student temp = this.classRoom.get(i);
                    this.classRoom.set(i, this.classRoom.get(j));
                    this.classRoom.set(j, temp);
                }
            }
        }
    }

    @Override
    public void sortByName() {
    }
    
    public void getInformation(){
        for (Student sv :
                this.classRoom) {
            System.out.println("=======================");
            System.out.println("Id is :" + sv.getId());
            System.out.println("Name is :" + sv.getName());
            System.out.println(">>>>>>>>> ======================= <<<<<<<<<<");
        }
    }
}

