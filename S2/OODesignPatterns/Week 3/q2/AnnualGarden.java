public class AnnualGarden extends Garden {
    public Plant getShade() {
        return new Plant("Coleus", " - Rich");
    }
    public Plant getCenter() {
        return new Plant("Marigold", " - Rich");
    }
    public Plant getBorder() {
        return new Plant("Alyssum", " - Natural");
    }

}
