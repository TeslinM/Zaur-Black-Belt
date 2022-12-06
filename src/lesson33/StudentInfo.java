package lesson33;

import java.util.ArrayList;

public class StudentInfo {

    void testStudents(ArrayList<Student> al, StudentChecks sc) {
        for(Student s : al) {
            if(sc.check(s)) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Mike", 'm', 30, 5, 7.2);
        Student st3 = new Student("zaur", 'm', 19, 2, 5.5);
        Student st4 = new Student("elema", 'f', 24, 4, 9.2);
        Student st5 = new Student("alesya", 'f', 18, 1, 7.7);
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);

        StudentInfo info = new StudentInfo();
//        info.testStudents(studentList, new CheckOverGrade());
//        System.out.println("--------------------------");
//        info.testStudents(studentList, new StudentChecks() {
//            @Override
//            public boolean check(Student s) {
//                return s.age<30;
//            }
//        });
        info.testStudents(studentList, (Student s) -> {return s.avgGrade>8;});
        info.testStudents(studentList, s -> s.avgGrade>8);




        System.out.println("--------------------------");
        info.testStudents(studentList, (Student s) -> {return s.age<30;});
        System.out.println("__________________________");
        info.testStudents(studentList, (Student s) -> {return s.age>20 && s.avgGrade < 9.3 && s.sex == 'f';});

//        info.printStudentOverGrade(studentList, 8);
//        System.out.println("--------------------------");
//        info.printStudentUnderAge(studentList, 30);
//        System.out.println("--------------------------");
//        info.printStudentsMixCondition(studentList, 20, 'f', 9);

    }

//    void printStudentOverGrade(ArrayList<Student> al, double grade) {
//        for(Student s : al) {
//            if(s.avgGrade>grade) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentUnderAge(ArrayList<Student> al, int age) {
//        for(Student s : al) {
//            if(s.age<age) {
//                System.out.println(s);
//            }
//        }
//
//    }
//
//    void printStudentsMixCondition(ArrayList<Student> al, int age, char sex, double grade) {
//        for(Student s : al) {
//            if(s.age>age && s.avgGrade<grade && s.sex==sex) {
//                System.out.println(s);
//            }
//        }
//    }
}

interface StudentChecks {
    boolean check(Student s);
}

class CheckOverGrade implements StudentChecks {
    @Override
    public boolean check(Student s) {
        return s.avgGrade>8;
    }
}
