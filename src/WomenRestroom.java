public class WomenRestroom extends Restroom {
    public String getServicesListAvailable() {
        String content = "";
        for (Toilet toilet : this.getToilets()) {
            if (toilet.isAvailable()) {
                content += toilet + "\n";
            }
        }
        if (this.getDisabilityToilet().isAvailable()) {
            content += this.getDisabilityToilet() + "\n";
        }
        return content;
    }
}
