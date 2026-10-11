abstract class ArtPiece {
    private static int nextPieceNumber = 1;
    private final String pieceId;

    public ArtPiece() {
        this.pieceId = "ART-" + nextPieceNumber++;
    }

    public abstract String describe();

    public String getPieceId() {
        return pieceId;
    }
}

class Painting extends ArtPiece {
    private final String title;

    public Painting(String title) {
        if (title == null || title.isBlank()) throw new IllegalArgumentException("title cannot be blank");
        this.title = title;
    }

    @Override
    public String describe() {
        return "Painting: " + title + ", framed on canvas";
    }
}

class Sculpture extends ArtPiece {
    private final String title;

    public Sculpture(String title) {
        if (title == null || title.isBlank()) throw new IllegalArgumentException("title cannot be blank");
        this.title = title;
    }

    @Override
    public String describe() {
        return "Sculpture: " + title + ", carved from stone";
    }
}

public class ArtPieceDemo {
    public static void main(String[] args) {
        Painting p = new Painting("Sunset Fields");
        Sculpture s = new Sculpture("The Thinker II");
        System.out.println(p.describe() + " [" + p.getPieceId() + "]");
        System.out.println(s.describe() + " [" + s.getPieceId() + "]");
    }
}
