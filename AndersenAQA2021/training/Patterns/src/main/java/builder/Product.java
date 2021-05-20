package builder;

public class Product{
    private String name;
    private AppType type;
    private String programmingLang;
    private String[] languages;
    private String purpose;
    private boolean hasAqa;
    private boolean hasMobApp;
    private boolean hasDesktopApp;
    private boolean hasLinuxApp;
    private boolean hasMacApp;
    private boolean isOpenSource;
    private int potentialProjectCost;
    private double potentialAppPrice;

    public Product(String name, AppType type, String programmingLang, String[] languages, String purpose, boolean hasAqa,
                   boolean hasMobApp, boolean hasDesktopApp, boolean hasLinuxApp, boolean hasMacApp,
                   boolean isOpenSource, int potentialProjectCost, double potentialAppPrice) {
        this.name = name;
        this.type = type;
        this.programmingLang = programmingLang;
        this.languages = languages;
        this.purpose = purpose;
        this.hasAqa = hasAqa;
        this.hasMobApp = hasMobApp;
        this.hasDesktopApp = hasDesktopApp;
        this.hasLinuxApp = hasLinuxApp;
        this.hasMacApp = hasMacApp;
        this.isOpenSource = isOpenSource;
        this.potentialProjectCost = potentialProjectCost;
        this.potentialAppPrice = potentialAppPrice;
    }

    public String getName() {
        return name;
    }

    public AppType getType() {
        return type;
    }

    public String getProgrammingLang() {
        return programmingLang;
    }

    public String[] getLanguages() {
        return languages;
    }

    public String getPurpose() {
        return purpose;
    }

    public boolean isHasAqa() {
        return hasAqa;
    }

    public boolean isHasMobApp() {
        return hasMobApp;
    }

    public boolean isHasDesktopApp() {
        return hasDesktopApp;
    }

    public boolean isHasLinuxApp() {
        return hasLinuxApp;
    }

    public boolean isHasMacApp() {
        return hasMacApp;
    }

    public boolean isOpenSource() {
        return isOpenSource;
    }

    public int getPotentialProjectCost() {
        return potentialProjectCost;
    }

    public double getPotentialAppPrice() {
        return potentialAppPrice;
    }
}
