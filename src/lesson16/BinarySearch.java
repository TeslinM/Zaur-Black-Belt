package lesson16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(8);
        arrayList.add(12);
        arrayList.add(-8);
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(150);
        arrayList.add(-30);
        arrayList.add(19);
        Collections.sort(arrayList);
        int index = Collections.binarySearch(arrayList, 12);
        //System.out.println(index);

        Employee emp1 = new Employee(100, "zaur", 12345);
        Employee emp2 = new Employee(15, "anzorik", 652);
        Employee emp3 = new Employee(123, "lesya", 985332);
        Employee emp4 = new Employee(15, "mike", 45);
        Employee emp5 = new Employee(185, "kolya", 2120);
        Employee emp6 = new Employee(15, "sasha", 2365);
        Employee emp7 = new Employee(250, "elena", 1000);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        employeeList.add(emp7);
        System.out.println(employeeList);
        Collections.sort(employeeList);
        System.out.println(employeeList);
        int index1 = Collections.binarySearch(employeeList, new Employee(123, "lesya", 985332));
        System.out.println(index1);

        int[] array = {-3, 8, 12, -8, 0, 5, 10, 1, 150, -30, 19};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        int index3 = Arrays.binarySearch(array, 150);
        System.out.println(index3);
    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        int result = this.id - anotherEmp.id;
        if(result==0) {
            result = this.name.compareTo(anotherEmp.name);
        }
        return result;
    }
}
