import abstract_factory.AvgFactory;
import abstract_factory.EmployeeFactory;
import abstract_factory.FreshFactory;
import abstract_factory.TiredFactory;
import builder.*;
import factory_method.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class App {
    private static Employees employees;

    public static void main(String[] args) {
        configure();
        run();
        Vocation vocation = configureForAbstract();
        vocation.printIsTired();
        System.out.println();

        builder();
        System.out.println();

        prototypes();
    }

    public static Vocation configureForAbstract() {
        Vocation vocation;
        EmployeeFactory factory;
        Date date = new Date();
        int month = date.getMonth() + 1;
        if (month >= 9) {
            factory = new TiredFactory();
            vocation = new Vocation(factory);
        } else if (month >= 5) {
            factory = new AvgFactory();
            vocation = new Vocation(factory);
        } else {
            factory = new FreshFactory();
            vocation = new Vocation(factory);
        }
        return vocation;
    }

    static void builder() {
        Director director = new Director();
        ProductBuilder builder = new ProductBuilder();
        director.constructAppleApp(builder);

        Product product = builder.getResult();
        System.out.println("Product created: " + product.getName());

        ProductManualBuilder manualBuilder = new ProductManualBuilder();
        director.constructCrossPlatformApp(manualBuilder);
        ProductManual manual = manualBuilder.getResult();
        System.out.println("Manual for the app: " + manual.toString());
    }
    static void prototypes() {
        List<Employees> employeesList = new ArrayList<>();
        List<Employees> copiesEmployees = new ArrayList<>();

        Junior junior = new Junior();
        junior.setName("JunName");
        junior.setAge(21);
        employeesList.add(junior);
        Medium medium = new Medium();
        medium.setName("MedName");
        medium.setLatestVocation(2);
        employeesList.add(medium);
        Senior senior = new Senior();
        senior.setName("SenName");
        senior.setLatestVocation(10);
        employeesList.add(senior);

        for (Employees employee : employeesList) {
            copiesEmployees.add(employee.clone());
        }

        for (int i = 0; i < employeesList.size(); i++) {
            if (employeesList.get(i) != copiesEmployees.get(i)) {
                System.out.println(i + ": different employees!");
                if (employeesList.get(i).equals(copiesEmployees.get(i))) {
                    System.out.println(i + ": and identical!");
                } else {
                    System.out.println(i + ": but not identical.");
                }
            } else {
                System.out.println(i + ": employees are the same...");
            }
        }

    }

    static void configure(){
        // logic depends on something
        employees = new JuniorEmployee();
    }

    static void run() {
        employees.hireCandidate();
    }

}
