package abstract_factory;

public class TiredFactory implements EmployeeFactory {
    public Junior createJunior() {
        return new JuniorTired();
    }

    public Medium createMedium() {
        return new MediumTired();
    }

    public Senior createSenior() {
        return new SeniorTired();
    }
}
