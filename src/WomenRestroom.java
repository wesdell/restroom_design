public class WomenRestroom {
  private Toilet[] toilets;

  public WomenRestroom() {
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

  public String getServicesListAvailable() {
    String content = "";
    for (Toilet toilet : this.toilets) {
      if (toilet.isAvailable()) {
        content += toilet + "\n";
      }
    }
    return content;
  }
}