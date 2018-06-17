public class PerennialGarden extends Garden {
    public Plant getShade() {
        return new Plant("Astilbe", " - Rich");
    }
    public Plant getCenter() {
        return new Plant("Dicentrum", " - Rich");
    }
    public Plant getBorder() {
        return new Plant("Sedum", " - Clay");
    }

}
