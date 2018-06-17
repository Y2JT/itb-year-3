public class VeggieGarden extends Garden {
    public Plant getShade() {
        return new Plant("Broccoli", " - Clay");
    }
    public Plant getCenter() {
        return new Plant("Corn", " - Rich");
    }
    public Plant getBorder() {
        return new Plant("Peas", " - Acidic");
    }

}
