public class WomenRestroom {
    private final Toilet[] toilets;
    private DisabilityToilet disabilityToilet;

    public WomenRestroom() {
        this.disabilityToilet = new DisabilityToilet();
        this.toilets = new Toilet[4];
        for (int i = 0; i < this.toilets.length; i += 1) {
            this.toilets[i] = new Toilet();
        }
    }

    public Toilet useFirstAvailableCleanToilet() {
        for (Toilet toilet : this.toilets) {
            if (toilet.isAvailableClean()) {
                toilet.use();
                return toilet;
            }
        }
        return null;
    }

    public DisabilityToilet useFirstAvailableCleanDisabilityToilet() {
        if (this.disabilityToilet.isAvailableClean()) {
            disabilityToilet.use();
        }
        return disabilityToilet;
    }

    public String getServicesListAvailable() {
        String content = "";
        for (Toilet toilet : this.toilets) {
            if (toilet.isAvailable()) {
                content += toilet + "\n";
            }
        }
        if (disabilityToilet.isAvailable()) {
            content += disabilityToilet + "\n";
        }
        return content;
    }
}