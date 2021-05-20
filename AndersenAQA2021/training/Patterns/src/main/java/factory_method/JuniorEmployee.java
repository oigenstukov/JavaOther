package factory_method;

import java.util.Objects;

public class JuniorEmployee extends Employees {
    private int age;

    public JuniorEmployee() {
    }

    public JuniorEmployee(JuniorEmployee employee) {
        super(employee);
        if (employee != null) {
            this.age = employee.age;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Employees clone() {
        return new Junior(this);
    }

    public Employee createEmployee() {
        return new Junior(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        JuniorEmployee that = (JuniorEmployee) o;
        return age == that.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), age);
    }
}
