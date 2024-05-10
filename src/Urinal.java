public class Urinal {
  private boolean available;
  private boolean clean;

  public Urinal() {
    this.available = true;
    this.clean = true;
  }

  public boolean isAvailableClean() {
    return this.available && this.clean;
  }

  public void use() {
    this.available = false;
  }

  public boolean isAvailable() {
    return this.available;
  }

  public String printAvailability() {
    return this.available ? "Available" : "Not Available";
  }

  @Override
  public String toString() {
    return getClass().getName() + " (" + printAvailability() + ")";
  }
}