abstract class DeliveryNote {
    public abstract String confirmDelivery();

    public String confirmDelivery(String signature) {
        if (signature == null || signature.trim().isEmpty()) {
            throw new IllegalArgumentException("signature must not be blank");
        }
        return confirmDelivery() + ", signed by " + signature;
    }
}

class ParcelNote extends DeliveryNote {
    private final String trackingId;

    public ParcelNote(String trackingId) {
        this.trackingId = requireNonBlank(trackingId, "trackingId");
    }

    @Override
    public String confirmDelivery() {
        return "Parcel " + trackingId + " delivered";
    }

    private static String requireNonBlank(String value, String field) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(field + " must not be blank");
        }
        return value;
    }
}

class LetterNote extends DeliveryNote {
    private final String trackingId;

    public LetterNote(String trackingId) {
        this.trackingId = requireNonBlank(trackingId, "trackingId");
    }

    @Override
    public String confirmDelivery() {
        return "Letter " + trackingId + " delivered";
    }

    private static String requireNonBlank(String value, String field) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(field + " must not be blank");
        }
        return value;
    }
}

public class DeliveryNoteDemo {
    public static void logAll(DeliveryNote[] notes) {
        if (notes == null) return;
        for (DeliveryNote note : notes) {
            if (note != null) System.out.println(note.confirmDelivery());
        }
    }

    public static void main(String[] args) {
        ParcelNote parcel = new ParcelNote("TRK-1");
        System.out.println(parcel.confirmDelivery());
        System.out.println(parcel.confirmDelivery("J. Smith"));
        DeliveryNote ref = parcel; // Upcasting
        logAll(new DeliveryNote[]{ref, new LetterNote("TRK-2")});
    }
}
