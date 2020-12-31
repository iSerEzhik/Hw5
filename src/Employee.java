import java.util.Scanner;

public class Employee {
    String name;
    String position;
    String eMail;
    String phone;
    int salary;
    int age;
    Scanner scan = new Scanner(System.in);

    public Employee() {
        System.out.println("Введите ФИО сотрудника: ");
        this.name = scan.nextLine();
        System.out.println("Введите возраст сотрудника: ");
        this.age = scan.nextInt();
        System.out.println("Введите должность сотрудника: ");
        this.position = scan.nextLine();
        this.position = scan.nextLine();
        System.out.println("Введите почту сотрудника: ");
        this.eMail = scan.nextLine();
        System.out.println("Введите телефон сотрудника");
        this.phone = scan.nextLine();
        System.out.println("Введите зарплату сотрудника: ");
        this.salary = scan.nextInt();
    }
    public void outputEmployee()
    {
        System.out.println("Имя: "+this.name);
        System.out.println("Возраст: "+this.age);
        System.out.println("Должность: "+this.position);
        System.out.println("Почта: "+this.eMail);
        System.out.println("Телефон: "+this.phone);
        System.out.println("Зарплата: "+this.salary);
        
    }
}

