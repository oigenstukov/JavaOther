package factory_method;

import java.util.Objects;

public class MediumEmployee extends Employees {
    private double workExp;
    private int latestVocation;

    public MediumEmployee() {
    }

    public MediumEmployee(MediumEmployee employee) {
        super(employee);
        this.workExp = employee.workExp;
        this.latestVocation = employee.latestVocation;
    }

    public int getLatestVocation() {
        return latestVocation;
    }

    @Override
    public Employees clone() {
        return new Medium(this);
    }

    public Employee createEmployee() {
        return new Medium();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MediumEmployee)) return false;
        if (!super.equals(o)) return false;
        MediumEmployee that = (MediumEmployee) o;
        return Double.compare(that.workExp, workExp) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), workExp);
    }
}
