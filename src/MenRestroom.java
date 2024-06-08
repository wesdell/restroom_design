public class MenRestroom extends Restroom {
  private final Urinal[] urinals;

  public MenRestroom() {
    this.urinals = new Urinal[4];
    for (int i = 0; i < urinals.length; i += 1) {
      this.urinals[i] = new Urinal();
    }
  }

  public Urinal useFirstAvailableCleanUrinal() {
    for (Urinal urinal : urinals) {
      if (urinal.isAvailableAndClean()) {
        urinal.use();
        return urinal;
      }
    }
    return null;
  }

  public String getServicesListAvailable() {
    String content = "";
    for (Urinal urinal : this.urinals) {
      if (urinal.isAvailable()) {
        content += urinal + "\n";
      }
    }
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
