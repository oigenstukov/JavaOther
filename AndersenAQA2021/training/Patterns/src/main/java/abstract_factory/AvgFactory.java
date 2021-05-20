package abstract_factory;

public class AvgFactory implements EmployeeFactory {
    public Junior createJunior() {
        return new JuniorAvg();
    }

    public Medium createMedium() {
        return new MediumAvg();
    }

    public Senior createSenior() {
        return new SeniorAvg();
    }
}
