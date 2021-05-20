package abstract_factory;

/*abstract factory*/
public interface EmployeeFactory {
    Junior createJunior();
    Medium createMedium();
    Senior createSenior();
}
