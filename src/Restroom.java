public abstract class Restroom {
  private final Toilet[] toilets;
  private DisabilityToilet disabilityToilet;

  public Restroom() {
    this.disabilityToilet = new DisabilityToilet();
    this.toilets = new Toilet[4];
    for (int i = 0; i < this.toilets.length; i += 1) {
      this.toilets[i] = new Toilet();
    }
  }

  public Toilet[] getToilets() {
    return this.toilets;
  }

  public DisabilityToilet getDisabilityToilet() {
    return this.disabilityToilet;
  }

  public Toilet useFirstAvailableCleanToilet() {
    for (Toilet toilet : this.toilets) {
      if (toilet.isAvailableAndClean()) {
        toilet.use();
        return toilet;
      }
    }
    return null;
  }

  public DisabilityToilet useFirstAvailableCleanDisabilityToilet() {
    if (this.disabilityToilet.isAvailableAndClean()) {
      disabilityToilet.use();
    }
    return disabilityToilet;
  }

  public abstract String getServicesListAvailable();
}
