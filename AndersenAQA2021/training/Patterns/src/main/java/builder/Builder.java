package builder;

public interface Builder {
    void setName(String name);

    void setAppType(AppType type);

    void setProgrammingLang(String pLang);

    void setLanguages(String[] languages);

    void setPurpose(String purpose);

    void setHasAqa(boolean hasAqa);

    void setHasMobApp(boolean hasMobApp);

    void setHasDesktopApp(boolean hasDesktopApp);

    void setHasLinuxApp(boolean hasLinuxApp);

    void setHasMacApp(boolean hasMacApp);

    void setIsOpenSource(boolean isOpenSource);

    void setPotentialProjectCost(int potentialProjectCost);

    void setPotentialAppPrice(double potentialAppPrice);
}
