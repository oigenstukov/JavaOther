package builder;

public class Director {
    public void constructAppleApp(Builder builder) {
        builder.setName("Some Apple Application");
        builder.setAppType(AppType.APPLE_PRODUCT);
        builder.setProgrammingLang("Swift");
        builder.setLanguages(new String[] {"en", "pl", "fr"});
        builder.setPurpose("some purposes");
        builder.setHasAqa(true);
        builder.setHasMobApp(true);
        builder.setHasMacApp(true);
        builder.setPotentialProjectCost(100000);
        builder.setPotentialAppPrice(4.99);
    }

    public void constructWinApp(Builder builder) {
        builder.setName("Some Windows Application");
        builder.setAppType(AppType.WINDOWS_PRODUCT);
        builder.setProgrammingLang("C++");
        builder.setLanguages(new String[] {"ru", "ua", "blr"});
        builder.setPurpose("some purposes");
        builder.setHasDesktopApp(true);
        builder.setIsOpenSource(true);
        builder.setPotentialProjectCost(50000);
        builder.setPotentialAppPrice(0.99);
    }

    public void constructCrossPlatformApp(Builder builder) {
        builder.setName("Some Application");
        builder.setAppType(AppType.CROSS_PLATFORM_APP);
        builder.setProgrammingLang("Java");
        builder.setLanguages(new String[] {"en", "ita", "pl", "ru", "ge", "fr"});
        builder.setPurpose("some purposes");
        builder.setHasAqa(true);
        builder.setHasMobApp(true);
        builder.setHasDesktopApp(true);
        builder.setHasLinuxApp(true);
        builder.setHasMacApp(true);
        builder.setPotentialProjectCost(200000);
        builder.setPotentialAppPrice(1.49);
    }
}
