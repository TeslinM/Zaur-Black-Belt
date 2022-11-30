package lesson14;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        Student st1 = new Student("ivan", 2);
        Student st2 = new Student("grisha", 1);
        Student st3 = new Student("tom", 3);
        Student st4 = new Student("elena", 5);
        Student st5 = new Student("petr", 4);

        LinkedList<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(st1);
        studentLinkedList.add(st2);
        studentLinkedList.add(st3);
        studentLinkedList.add(st4);
        studentLinkedList.add(st5);
        System.out.println("LinkedList = " + studentLinkedList);
        System.out.println(studentLinkedList.get(2));
        Student st6 = new Student("igor", 1);
        Student st7 = new Student("arik", 2);
        studentLinkedList.add(st6);
        System.out.println(studentLinkedList);
        studentLinkedList.add(1, st7);
        System.out.println(studentLinkedList);
        studentLinkedList.remove(3);
        System.out.println(studentLinkedList);

    }
}

class Student {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}


