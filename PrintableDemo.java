interface Printable {
    String printLabel();
}

class PackageBox implements Printable {
    private final String trackingId;

    public PackageBox(String trackingId) {
        this.trackingId = requireNonBlank(trackingId, "trackingId");
    }

    @Override
    public String printLabel() {
        return "Package label: " + trackingId;
    }

    private static String requireNonBlank(String value, String field) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(field + " must not be blank");
        }
        return value;
    }
}

class Invoice implements Printable {
    private final String invoiceNumber;

    public Invoice(String invoiceNumber) {
        this.invoiceNumber = requireNonBlank(invoiceNumber, "invoiceNumber");
    }

    @Override
    public String printLabel() {
        return "Invoice label: " + invoiceNumber;
    }

    private static String requireNonBlank(String value, String field) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(field + " must not be blank");
        }
        return value;
    }
}

public class PrintableDemo {
    public static void printAll(Printable[] items) {
        if (items == null) return;
        for (Printable item : items) {
            if (item != null) System.out.println(item.printLabel());
        }
    }

    public static void main(String[] args) {
        PackageBox p = new PackageBox("TRK-88");
        Invoice i = new Invoice("INV-42");
        System.out.println(p.printLabel());
        System.out.println(i.printLabel());
        printAll(new Printable[]{p, i});
    }
}
