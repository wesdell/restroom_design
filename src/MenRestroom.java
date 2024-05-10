public class MenRestroom {
  private Urinal[] urinals;

  public MenRestroom() {
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

  public String getServicesListAvailable() {
    String content = "";
    for (Urinal urinal : urinals) {
      if (urinal.isAvailable()) {
        content += urinal + "\n";
      }
    }
    return content;
  }
}