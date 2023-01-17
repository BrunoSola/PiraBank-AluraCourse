package application;

import employee.Employee;
import employee.Manager;
import entities.BonusController;

public class TestPolimorfismo {

    public static void main(String[] args) {

        Employee m1 = new Manager();
        m1.setName("Bruno Sola");
        m1.setSalary(5000.0);

        Employee m2 = new Manager();
        m2.setName("Rafael Sola");
        m2.setSalary(10000.0);

        Employee e1 = new Employee();
        e1.setName("Joao Sola");
        e1.setSalary(3000.0);

        Employee e2 = new Employee();
        e2.setName("Ricardo Sola");
        e2.setSalary(2000.0);

        BonusController controller = new BonusController();
        controller.register(m1);
        controller.register(m2);
        controller.register(e1);
        controller.register(e2);

        System.out.println(controller.getSum());

    }
}
