package builder;

public class ProductManualBuilder implements Builder{
    private String name;
    private AppType type;
    private String programmingLanguage;
    private String[] languages;
    private String purpose;
    private boolean hasAQA;
    private boolean hasMobileApp;
    private boolean hasDesktopApp;
    private boolean hasLinuxApp;
    private boolean hasMacApp;
    private boolean isOpenSource;
    private int potentialProjectCost;
    private double potentialAppPrice;

    public void setName(String name) {
        this.name = name;
    }

    public void setAppType(AppType type) {
        this.type = type;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public void setProgrammingLang(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public void setHasAqa(boolean hasAQA) {
        this.hasAQA = hasAQA;
    }

    public void setHasMobApp(boolean hasMobileApp) {
        this.hasMobileApp = hasMobileApp;
    }

    public void setHasDesktopApp(boolean hasDesktopApp) {
        this.hasDesktopApp = hasDesktopApp;
    }

    public void setHasLinuxApp(boolean hasLinuxApp) {
        this.hasLinuxApp = hasLinuxApp;
    }

    public void setHasMacApp(boolean hasMacApp) {
        this.hasMacApp = hasMacApp;
    }

    public void setIsOpenSource(boolean openSource) {
        isOpenSource = openSource;
    }

    public void setPotentialProjectCost(int potentialProjectCost) {
        this.potentialProjectCost = potentialProjectCost;
    }

    public void setPotentialAppPrice(double potentialAppPrice) {
        this.potentialAppPrice = potentialAppPrice;
    }

    public ProductManual getResult() {
        return new ProductManual(name, type, programmingLanguage, languages, purpose, hasAQA, hasMobileApp, hasDesktopApp,
                hasLinuxApp, hasMacApp, isOpenSource, potentialProjectCost, potentialAppPrice);
    }
}
