public class TreeGarden extends Garden {
    public Plant getShade() {
        return new Plant("A Tree", " - Rich");
    }
    public Plant getCenter() {
        return new Plant("Oak", " - Clay");
    }
    public Plant getBorder() {
        return new Plant("Evergreen", " - Rich");
    }

}
