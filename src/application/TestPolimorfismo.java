package application;

import employee.*;
import util.BonusController;

public class TestPolimorfismo {

    public static void main(String[] args) {

        Employee manager1 = new Manager();
        manager1.setName("Bruno Sola");
        manager1.setSalary(15000.0);

        Employee adm1 = new Administration();
        adm1.setName("Rafael Sola");
        adm1.setSalary(3500.0);

        Employee banker1 = new Banker();
        banker1.setName("Joao Sola");
        banker1.setSalary(5000.0);

        Employee economist1 = new Economist();
        economist1.setName("Ricardo Sola");
        economist1.setSalary(8000.0);

        Employee economist2 = new Economist();
        economist2.setName("Isaias Sola");
        economist2.setSalary(7000.0);

        Employee marketing1 = new Marketing();
        marketing1.setName("Ronaldo Sola");
        marketing1.setSalary(4000.0);

        BonusController controller = new BonusController();
        controller.register(manager1);
        controller.register(adm1);
        controller.register(banker1);
        controller.register(economist1);
        controller.register(economist2);
        controller.register(marketing1);

//        System.out.println("O bônus do "+ manager1.getName() + " é R$" + manager1.getBonus());
//        System.out.println("O bônus do "+ adm1.getName() + " é R$" + adm1.getBonus());
//        System.out.println("O bônus do "+ banker1.getName() + " é R$" + banker1.getBonus());
//        System.out.println("O bônus do "+ economist1.getName() + " é R$" + economist1.getBonus());
//        System.out.println("O bônus do "+ marketing1.getName() + " é R$" + marketing1.getBonus());
        System.out.println("A bonificação total dos funcionarios é R$" + controller.getSum());

    }
}
