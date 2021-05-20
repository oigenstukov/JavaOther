package builder;

import java.util.Arrays;

public class ProductManual {
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

    public ProductManual(String name, AppType type, String programmingLang, String[] languages, String purpose,
                         boolean hasAqa, boolean hasMobApp, boolean hasDesktopApp, boolean hasLinuxApp,
                         boolean hasMacApp, boolean isOpenSource, int potentialProjectCost, double potentialAppPrice) {
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Manual of the product!");
        sb.append("\n\tApp name: ").append(name);
        sb.append("\n\tProduct type: ").append(type.toString().toLowerCase());
        sb.append("\n\tUsed programming language: ").append(programmingLang);
        String langs = Arrays.toString(languages)
                .replaceAll("\\[", "")
                .replaceAll("]", "");
        sb.append("\n\tSupported languages: ").append(langs);
        sb.append("\n\tPurposes: ").append(purpose);
        if (hasAqa) {
            sb.append("\n\tAutomated QA available");
        }
        if (hasMobApp) {
            sb.append("\n\tThere is a mobile app");
        }
        if (hasDesktopApp) {
            sb.append("\n\tThere is a windows desktop app");
        }
        if (hasLinuxApp) {
            sb.append("\n\tThere is a linux app");
        }
        if (hasMacApp) {
            sb.append("\n\tMac app available");
        }
        if (isOpenSource) {
            sb.append("\n\tApp is open source");
        }
        sb.append("\n\tPotential cost of the project is ").append(potentialProjectCost);
        sb.append("\n\tPotential price of the app is ").append(potentialAppPrice);

        return sb.toString();
    }
}
