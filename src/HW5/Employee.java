package HW5;

public class Employee {
    private String fullName;
    private String positiond;
    private String email;
    private long telephone;
    private int salary;
    private int age;

    public static void main(String[] args) {
        Employee[] emp = new Employee[5];
        emp[0] = new Employee("Булкин Артем Федоров", "менеджер", "bfffu@mmail.ru", 89254176546l, 30000, 42);
        emp[1] = new Employee("Аворн Даниил Николаевич", "администратор", "sdfa@mmail.ru", 89254145546l, 40000, 35);
        emp[2] = new Employee("Атрин Артем Петрович", "инженер", "bsdfgou@mmail.ru", 89254173546l, 20000, 25);
        emp[3] = new Employee("Булкин Сергей Николаевич", "механик", "baasd@mmail.ru", 89252346546l, 60000, 47);
        emp[4] = new Employee("Верон Андрей Валерьевич", "слесарь", "bsdfsdu@mmail.ru", 89254326546l, 57000, 58);

        for (int i = 0; i < emp.length; i++) {
            if (emp[i].age > 40) {
                emp[i].print();

            }
        }
    }

    public void print() {
        System.out.println("Фамилия Имя Отчество: " + fullName + ", Должность: " + positiond
                + ", Адресс электронной почты: " + email + ", Номер телефона: " + telephone + ", Зарплата: " + salary + ", Возраст: " + age);
    }

    public Employee(String fullName, String positiond, String email, long telephone, int salary, int age) {
        this.fullName = fullName;
        this.positiond = positiond;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", positiond='" + positiond + '\'' +
                ", email='" + email + '\'' +
                ", telephone=" + telephone +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
