public class Building {
  private WomenRestroom womenRestroom;
  private MenRestroom menRestroom;

  public Building() {
    this.womenRestroom = new WomenRestroom();
    this.menRestroom = new MenRestroom();
  }

  public WomenRestroom getWomenRestroom() {
    return womenRestroom;
  }

  public MenRestroom getMenRestroom() {
    return menRestroom;
  }
}