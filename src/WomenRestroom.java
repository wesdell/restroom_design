public class WomenRestroom {
  private Toilet[] toilets;

  public WomenRestroom() {
    this.toilets = new Toilet[4];
    for (int i = 0; i < toilets.length; i += 1) {
      this.toilets[i] = new Toilet();
    }
  }

  public Toilet useFirstAvailableCleanToilet() {
    for (Toilet toilet : toilets) {
      if (toilet.isAvailableClean()) {
        toilet.use();
        return toilet;
      }
    }
    return null;
  }
}