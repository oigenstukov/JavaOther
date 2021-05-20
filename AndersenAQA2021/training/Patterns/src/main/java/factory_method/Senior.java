package factory_method;

public class Senior extends SeniorEmployee implements Employee {
    private int latestVocation;

    public Senior() {
    }

    public Senior(SeniorEmployee employee) {
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
        System.out.println("Senior working");
    }

    public boolean hasEndurance() {
        return getLatestVocation() < 9;
    }
}
