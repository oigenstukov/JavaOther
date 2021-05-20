package factory_method;

public class Medium extends MediumEmployee implements Employee {
    private int latestVocation;

    public Medium() {
    }

    public Medium(MediumEmployee employee) {
        super(employee);
        this.latestVocation = employee.getLatestVocation();
    }

    public int getLatestVocation() {
        return latestVocation;
    }

    public void setLatestVocation(int latestVocation) {
        this.latestVocation = latestVocation;
    }

    @Override
    public String toString() {
        return "latest vocation was: " + latestVocation + " month(s) ago";
    }

    public int latestVocation() {
        return getLatestVocation();
    }

    public void working() {
        System.out.println("Medium working");
    }

    public boolean hasEndurance() {
        return latestVocation() < 9;
    }
}
