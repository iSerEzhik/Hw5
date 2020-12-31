import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во сотрудников: ");
        int quan = scan.nextInt();
        Employee[] person = new Employee[quan];
        for (int i = 0; i < quan; i++) {
            person[i] = new Employee();
        }

        for (int i = 0; i < quan; i++) {
            if (person[i].age > 40) {
                person[i].outputEmployee();
            }
        }
    }

}
