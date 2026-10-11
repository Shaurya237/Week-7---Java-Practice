abstract class Instrument {
    public abstract String play();
}

class StringInstrument extends Instrument {
    public StringInstrument() {
        super();
    }

    @Override
    public String play() {
        return "Strumming the strings";
    }
}

class Violin extends StringInstrument {
    public Violin() {
        super();
    }

    @Override
    public String play() {
        return super.play() + ", with a bow drawn across four strings";
    }
}

public class InstrumentDemo {
    public static void main(String[] args) {
        StringInstrument instrument = new StringInstrument();
        Violin violin = new Violin();
        System.out.println(instrument.play());
        System.out.println(violin.play());
    }
}
