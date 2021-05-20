public class Firm {
    static Firm firm = null;
    private Firm() {
    }

    public static Firm getInstance() {
        if (firm == null) {
            return new Firm();
        } else {
            return firm;
        }
    }
}
