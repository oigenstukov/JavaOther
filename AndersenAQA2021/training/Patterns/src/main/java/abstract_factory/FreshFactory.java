package abstract_factory;

public class FreshFactory implements EmployeeFactory {
    public Junior createJunior() {
        return new JuniorFresh();
    }

    public Medium createMedium() {
        return new MediumFresh();
    }

    public Senior createSenior() {
        return new SeniorFresh();
    }
}
