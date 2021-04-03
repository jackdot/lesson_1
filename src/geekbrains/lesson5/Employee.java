package geekbrains.lesson5;

public class Employee {
    private String name;
    private int age;
    private String position;
    private int salary;
    private String email;
    private long phoneNumber;


    Employee(String name, int age, String position, int salary, String email, long phoneNumber ){
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void getEmployeeInfo(){
        System.out.println ("Имя: " + name + " " + "\nВозраст: " + age + "\nДолжность: " + position + "\nЗарплата: " + salary + " монет" + "\nПочта: " + email + "\nТелефон: " + "+" + phoneNumber + " ");
        System.out.println();
    }


}
