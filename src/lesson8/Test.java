package lesson8;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("ivan", 13);
        Schoolar schoolar2 = new Schoolar("petr", 15);

        Student student1 = new Student("kolya", 20);
        Student student2 = new Student("kseniya", 18);

        Employee employee1 = new Employee("zaur", 32);
        Employee employee2 = new Employee("mike", 30);

        Team<Schoolar> schoolarTeam = new Team<>("drakoni");
        Team<Student> studentTeam = new Team<>("vpered");
        Team<Employee> employeeTeam = new Team<>("rabotyagi");
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        Team<Schoolar> schoolarTeam2 = new Team<>("mudreci");
        Schoolar schoolar3 = new Schoolar("sergey", 12);
        Schoolar schoolar4 = new Schoolar("olya", 14);
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

        schoolarTeam.playWith(schoolarTeam2);
    }
}
