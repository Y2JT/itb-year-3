public class TreeGarden extends Garden {
    public Plant getShade() {
        return new Plant("A Tree");
    }
    public Plant getCenter() {
        return new Plant("Oak");
    }
    public Plant getBorder() {
        return new Plant("Evergreen");
    }

}
