package lesson5;

public class Person {
    private String fio;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person(String fio, String position, String email, String phone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public Person() {
    }

    public void info() {
        System.out.println(
                "Сотрудник: " + fio +
                        ", Должность: " + position +
                        ", E-Mail: " + email +
                        ", Телефон: " + phone +
                        ", Зарплата: " + salary +
                        ", Возраст: " + age
        );
    }

    public String getFio() {
        return fio;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class MainClass {
    public static void main(String[] args) {
        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Pupkin Vasiliy", "Manager", "vasya@mailbox.com", "892311111", 40000, 25);
        persArray[2] = new Person("Sergeyev Sergey", "Security", "sergey@mailbox.com", "892322222", 20000, 40);
        persArray[3] = new Person("Erokhin Ivan", "CEO", "erokhin@mailbox.com", "892333333", 300000, 45);
        persArray[4] = new Person("Sokolov Vladimir", "QA", "sokol@mailbox.com", "892344444", 25000, 20);

        for (Person person : persArray) {
            if (person.getAge() >= 40) {
                person.info();
            }
        }

        Person personBySetter = new Person();
        personBySetter.setFio("Vladimirov Semyon");
        personBySetter.setPosition("Janitor");
        personBySetter.setEmail("semyon@mailbox.com");
        personBySetter.setPhone("8(123)123-45-67");
        personBySetter.setSalary(15000);
        personBySetter.setAge(50);

        personBySetter.info();
    }
}