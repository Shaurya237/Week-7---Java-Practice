abstract class Drone {
    public abstract String fly();
}

interface Trackable {
    String getLocation();
}

class DeliveryDrone extends Drone implements Trackable {
    private final String id;

    public DeliveryDrone(String id) {
        if (id == null || id.isBlank()) throw new IllegalArgumentException("id cannot be blank");
        this.id = id;
    }

    @Override
    public String fly() {
        return "Delivery drone " + id + " flying with a package";
    }

    @Override
    public String getLocation() {
        return id + " at Sector 4";
    }
}

class ScoutDrone extends Drone {
    private final String id;

    public ScoutDrone(String id) {
        if (id == null || id.isBlank()) throw new IllegalArgumentException("id cannot be blank");
        this.id = id;
    }

    @Override
    public String fly() {
        return "Scout drone " + id + " surveying the area";
    }
}

class GroundRobot implements Trackable {
    private final String id;

    public GroundRobot(String id) {
        if (id == null || id.isBlank()) throw new IllegalArgumentException("id cannot be blank");
        this.id = id;
    }

    @Override
    public String getLocation() {
        return id + " at Sector 4";
    }
}

public class TrackableFleetDemo {
    static String getLocationIfTrackable(Object o) {
        if (o instanceof Trackable) {
            return ((Trackable) o).getLocation();
        }
        return "Tracking not available";
    }

    public static void main(String[] args) {
        DeliveryDrone d = new DeliveryDrone("DR-1");
        ScoutDrone s = new ScoutDrone("SC-1");
        GroundRobot g = new GroundRobot("GR-1");
        System.out.println(getLocationIfTrackable(d));
        System.out.println(getLocationIfTrackable(s));
        System.out.println(getLocationIfTrackable(g));
    }
}
