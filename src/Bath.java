public abstract class Bath {
  private boolean available;
  private boolean clean;

  public Bath() {
    this.available = true;
    this.clean = true;
  }

  public void use() {
    this.available = false;
    this.clean = false;
  }

  public void leaveAndClean() {
    this.available = true;
    this.clean = true;
  }

  public boolean isAvailableAndClean() {
    return this.available && this.clean;
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
