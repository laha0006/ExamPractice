package bil;

public class Bil {
    private Trailer trailer;
    private int vægt;

    public Bil(int vægt) {
        this.vægt = vægt;
    }

    public int getTotalVægt() {
        if(trailer != null)
            return vægt + trailer.getVægt();
        return vægt;
    }

    public Trailer getTrailer() {
        return trailer;
    }

    public int getVægt() {
        return vægt;
    }

    public boolean setTrailer(Trailer trailer) {
        if (vægt + trailer.getVægt() > 3500)
            return false;
        this.trailer = trailer;
        return true;
    }
}
