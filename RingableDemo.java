interface Ringable {
    String ring();
}

class AlarmClock implements Ringable {
    private final String time;

    public AlarmClock(String time) {
        if (time == null || time.isBlank()) {
            throw new IllegalArgumentException("time cannot be blank");
        }
        this.time = time;
    }

    @Override
    public String ring() {
        return "Alarm ringing for " + time;
    }
}

class Doorbell implements Ringable {
    private final String location;

    public Doorbell(String location) {
        if (location == null || location.isBlank()) {
            throw new IllegalArgumentException("location cannot be blank");
        }
        this.location = location;
    }

    @Override
    public String ring() {
        return "Doorbell ringing at " + location;
    }
}

public class RingableDemo {
    static void ringAll(Ringable[] devices) {
        if (devices == null) return;
        for (Ringable device : devices) {
            if (device != null) System.out.println(device.ring());
        }
    }

    public static void main(String[] args) {
        AlarmClock a = new AlarmClock("7:00 AM");
        Doorbell d = new Doorbell("Front Door");
        System.out.println(a.ring());
        System.out.println(d.ring());
        ringAll(new Ringable[]{a, d});
    }
}
