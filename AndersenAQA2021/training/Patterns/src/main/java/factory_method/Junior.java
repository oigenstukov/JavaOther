package factory_method;

public class Junior extends JuniorEmployee implements Employee {
    private int age;

    public Junior() {
    }

    public Junior(JuniorEmployee employee) {
        super(employee);
        this.age = employee.getAge();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "age: " + age;
    }

    public void working() {
        System.out.println("Junior working hard");
    }

    public boolean hasEndurance() {
        return true;
    }
}
