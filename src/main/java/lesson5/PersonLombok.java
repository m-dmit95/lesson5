package lesson5;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class PersonLombok {
    private String fio;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;
}

class MainClassByLombok {
    public static void main(String[] args) {
        PersonLombok[] persArray = new PersonLombok[5]; // Вначале объявляем массив объектов
        persArray[0] = new PersonLombok("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new PersonLombok("Pupkin Vasiliy", "Manager", "vasya@mailbox.com", "892311111", 40000, 25);
        persArray[2] = new PersonLombok("Sergeyev Sergey", "Security", "sergey@mailbox.com", "892322222", 20000, 40);
        persArray[3] = new PersonLombok("Erokhin Ivan", "CEO", "erokhin@mailbox.com", "892333333", 300000, 45);
        persArray[4] = new PersonLombok("Sokolov Vladimir", "QA", "sokol@mailbox.com", "892344444", 25000, 20);

        for (PersonLombok person : persArray) {
            if (person.getAge() >= 40) {
                System.out.println(person.toString());
            }
        }

        PersonLombok personBySetter = new PersonLombok();
        personBySetter.setFio("Vladimirov Semyon");
        personBySetter.setPosition("Janitor");
        personBySetter.setEmail("semyon@mailbox.com");
        personBySetter.setPhone("8(123)123-45-67");
        personBySetter.setSalary(15000);
        personBySetter.setAge(50);

        System.out.println(personBySetter.toString());

        System.out.println(personBySetter.getFio());
        System.out.println(personBySetter.getPosition());
        System.out.println(personBySetter.getEmail());
        System.out.println(personBySetter.getPhone());
        System.out.println(personBySetter.getSalary());
        System.out.println(personBySetter.getAge());
    }
}