package factory_method;

import java.util.Objects;

public class SeniorEmployee extends Employees {
    private int workExp;
    private int latestVocation;

    public SeniorEmployee() {
    }

    public SeniorEmployee(SeniorEmployee employee) {
        super(employee);
        this.workExp = employee.workExp;
    }

    public int getWorkExp() {
        return workExp;
    }

    public int getLatestVocation() {
        return latestVocation;
    }

    @Override
    public Employees clone() {
        return new Senior(this);
    }

    public Employee createEmployee() {
        return new Senior();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SeniorEmployee)) return false;
        if (!super.equals(o)) return false;
        SeniorEmployee that = (SeniorEmployee) o;
        return workExp == that.workExp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), workExp);
    }
}
