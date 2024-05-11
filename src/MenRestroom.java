public class MenRestroom {
  private final Urinal[] urinals;
  private DisabilityToilet disabilityToilet;

  public MenRestroom() {
    this.disabilityToilet = new DisabilityToilet();
    this.urinals = new Urinal[4];
    for (int i = 0; i < urinals.length; i += 1) {
      this.urinals[i] = new Urinal();
    }
  }

  public Urinal useFirstAvailableCleanUrinal() {
    for (Urinal urinal : urinals) {
      if (urinal.isAvailableClean()) {
        urinal.use();
        return urinal;
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
    for (Urinal urinal : this.urinals) {
      if (urinal.isAvailable()) {
        content += urinal + "\n";
      }
    }
    if (disabilityToilet.isAvailable()) {
      content += disabilityToilet + "\n";
    }
    return content;
  }
}