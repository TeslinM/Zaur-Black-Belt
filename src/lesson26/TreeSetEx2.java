package lesson26;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        Student st1 = new Student("Zaur", 1);
        Student st2 = new Student("Mike", 4);
        Student st3 = new Student("Tom", 2);
        Student st4 = new Student("Oleg", 2);
        Student st5 = new Student("Ivan", 5);
        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        System.out.println(treeSet);
        System.out.println(treeSet.subSet(st4, st5));
    }
}

class Student implements Comparable<Student> {
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

    @Override
    public int compareTo(Student other) {
        return this.course- other.course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
}
