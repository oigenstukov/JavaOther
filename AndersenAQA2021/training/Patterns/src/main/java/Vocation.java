import abstract_factory.EmployeeFactory;
import abstract_factory.Junior;
import abstract_factory.Medium;
import abstract_factory.Senior;

public class Vocation {
    private static Firm firm = Firm.getInstance();
    private Junior junior;
    private Medium medium;
    private Senior senior;

    public Vocation(EmployeeFactory factory) {
        junior = factory.createJunior();
        medium = factory.createMedium();
        senior = factory.createSenior();
    }

    public void printIsTired() {
        System.out.println(junior.hasEndurance());
        System.out.println(medium.hasEndurance());
        System.out.println(senior.hasEndurance());
    }
}
