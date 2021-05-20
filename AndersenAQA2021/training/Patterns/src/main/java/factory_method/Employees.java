package factory_method;

import java.util.Objects;

public abstract class Employees {
    private String name;

    public Employees() {
    }

    public Employees(Employees employee) {
        if (employee != null) {
            this.name = employee.name;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract Employees clone();

    public abstract Employee createEmployee();

    public void hireCandidate() {
        Employee employee = createEmployee();
        employee.working();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employees employees = (Employees) o;
        return name.equals(employees.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
