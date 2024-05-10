public class Building {
  private final WomenRestroom womenRestroom;
  private final MenRestroom menRestroom;

  public Building() {
    this.menRestroom = new MenRestroom();
    this.womenRestroom = new WomenRestroom();
  }

  public Urinal useFirstAvailableCleanUrinal() {
    return this.menRestroom.useFirstAvailableCleanUrinal();
  }

  public Toilet useFirstAvailableCleanToilet() {
    return this.womenRestroom.useFirstAvailableCleanToilet();
  }

  public String getRestroomsAvailable() {
    return "Men restroom: \n" + this.menRestroom.getServicesListAvailable() + "Women restroom: \n" + this.womenRestroom.getServicesListAvailable();
  }
}